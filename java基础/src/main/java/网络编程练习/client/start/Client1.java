package 网络编程练习.client.start;


import 网络编程练习.client.util.ClientWebUtil;
import 网络编程练习.server.req.LoginReq;
import 网络编程练习.server.resp.CloseConnResp;
import 网络编程练习.server.resp.CommonResp;
import 网络编程练习.server.resp.LoginResp;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 * @ClassName Client
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/5 下午10:34
 * @Version 1.0
 **/
public class Client1 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",19191);
        ClientWebUtil clientWebUtil = new ClientWebUtil(socket);

        while (true) {
            System.out.println("请输入用户名和密码");
            String name = sc.next();
            String password = sc.next();
            System.out.println("请输入登录类型：admin  user");
            String identity = sc.next();
            LoginReq res = new LoginReq(name, password, identity);

            clientWebUtil.sendObject(res);

            CommonResp resp = (CommonResp) clientWebUtil.getObject();
            if (resp.isSuccess()) {
                System.out.println("登录成功");
                LoginResp content = (LoginResp) resp.getContent();
                System.out.println("登录信息为:"+content.getMessage());
                System.out.println("测试完成，断开与服务器连接");

                //向服务端发送一个断开连接的请求
                clientWebUtil.sendObject(new CloseConnResp());
                //断开网络连接
                socket.close();
                return;
            } else {
                System.out.println(resp.getMessage());
                System.out.println("\n\n");
                System.out.println("请重新输入");

            }
        }

    }
}
