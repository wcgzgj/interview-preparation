package 网络编程;

import java.io.*;
import java.net.Socket;

/**
 * @ClassName TClient
 * @Description 多线程客户端
 * @Author FARO_Z
 * @Date 2021/5/5 下午6:11
 * @Version 1.0
 **/
public class TClient {
    public static void main(String[] args) throws IOException, InterruptedException {
        Socket socket = new Socket("127.0.0.1", 19191);

        while (true) {
            Thread.sleep(1000);
            OutputStream ops = socket.getOutputStream();
            PrintStream ps = new PrintStream(ops);
            ps.println("客户端：你好服务器");

            InputStream ips = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(ips));
            System.out.println(br.readLine());
        }
    }
}
