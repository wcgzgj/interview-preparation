package 网络编程;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ClassName Server
 * @Description 网络服务端
 * @Author FARO_Z
 * @Date 2021/5/5 下午5:03
 * @Version 1.0
 **/
public class Server {

    private static int count=0;

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(19191);
        /**
         * 每次在执行 accept()的时候，都会阻塞
         * 直到有一个客户端连接服务端，才会往下执行
         */
        Socket socket = ss.accept();
        System.out.println("客户端连接成功");
        InputStream is = socket.getInputStream();
        ObjectInputStream ois = new ObjectInputStream(is);
        Person person=null;
        try {
             person = (Person) ois.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(person.toString());

        OutputStream os = socket.getOutputStream();
        PrintStream ps = new PrintStream(os);
        ps.println("你好，客户端");
    }
}
