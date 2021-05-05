package 网络编程;

import java.io.*;
import java.net.Socket;

/**
 * @ClassName Client
 * @Description 网络客户端
 * @Author FARO_Z
 * @Date 2021/5/5 下午5:03
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) throws IOException, InterruptedException {
        Socket socket = new Socket("127.0.0.1", 19191);

        OutputStream os = socket.getOutputStream();
        PrintStream ps = new PrintStream(os);
        ps.println("你好，服务端");

        InputStream is = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        System.out.println(br.readLine());


    }
}
