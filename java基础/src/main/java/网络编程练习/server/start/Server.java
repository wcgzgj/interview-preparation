package 网络编程练习.server.start;

import 网络编程练习.server.req.LoginReq;
import 网络编程练习.server.resp.CloseConnResp;
import 网络编程练习.server.resp.CommonResp;
import 网络编程练习.server.resp.LoginResp;
import 网络编程练习.server.service.impl.UserServiceImpl;
import 网络编程练习.server.service.UserService;
import 网络编程练习.server.util.ServerWebUtil;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ClassName Server
 * @Description 多线程登录
 * @Author FARO_Z
 * @Date 2021/5/5 下午10:34
 * @Version 1.0
 **/
public class Server {

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(19191);
        while (true) {
            Socket socket = ss.accept();
            //开启新的登录线程
            new LoginThread(socket).start();
        }
    }
}

class LoginThread extends Thread {

    private Socket socket;

    private static UserService userService = new UserServiceImpl();

    public LoginThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        while (true) {
            ServerWebUtil serverWebUtil = new ServerWebUtil(socket);
            Object obj = serverWebUtil.getObject();
            /**
             * 如果检测到是客户端的断开连接请求
             * 则终止该线程
             */
            if (obj instanceof CloseConnResp) {
                System.out.println("检测到"+Thread.currentThread().getName()+"线程断开");
                System.out.println("3秒后断开服务端连接\n\n");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return;
            }
            //执行登录逻辑
            LoginReq req = (LoginReq) obj;
            LoginResp loginResp = userService.userLogin(req);
            CommonResp<LoginResp> resp = new CommonResp<>();
            if (loginResp.getName()==null) {
                resp.setMessage(loginResp.getMessage());
                resp.setSuccess(false);
                resp.setContent(loginResp);
                System.out.println(Thread.currentThread().getName()+"服务端判断失败");
            } else {
                resp.setMessage(loginResp.getMessage());
                resp.setSuccess(true);
                resp.setContent(loginResp);
                System.out.println(Thread.currentThread().getName()+"服务端判断成功");
            }

            /**
             * 向客户端传送通用数据报
             */
            serverWebUtil.sendObject(resp);
        }
    }
}
