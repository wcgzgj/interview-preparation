package 网络编程练习.server.start;

import 网络编程练习.server.req.LoginReq;
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
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/5 下午10:34
 * @Version 1.0
 **/
public class Server {

    private static UserService userService = new UserServiceImpl();

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(19191);
        Socket socket = ss.accept();
        ServerWebUtil serverWebUtil = new ServerWebUtil(socket);

        /**
         * 执行登录逻辑
         */
        LoginReq req = (LoginReq) serverWebUtil.getObject();
        LoginResp loginResp = userService.userLogin(req);
        CommonResp<LoginResp> resp = new CommonResp<>();
        if (loginResp.getName()==null) {
            resp.setMessage(loginResp.getMessage());
            resp.setSuccess(false);
            resp.setContent(loginResp);
        } else {
            resp.setMessage(loginResp.getMessage());
            resp.setSuccess(true);
            resp.setContent(loginResp);
        }

        /**
         * 向客户端传送通用数据报
         */
        serverWebUtil.sendObject(resp);

    }
}
