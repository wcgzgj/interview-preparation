package 网络编程;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ClassName TServer
 * @Description 多线程服务器
 * @Author FARO_Z
 * @Date 2021/5/5 下午6:10
 * @Version 1.0
 **/
public class TServer {

    private static int count=0;

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(19191);
        while (true) {
            /**
             * 每次执行 accept()的时候，都会阻塞
             * 等待新的客户端连接
             * 只有新的客户端连接，才会往下走
             */
            Socket socket = ss.accept();
            Thread t = new Thread(new ClientConn(socket), "连接-" + (++count));
            t.start();
        }
    }
}


class ClientConn implements Runnable {

    private Socket socket;

    public ClientConn(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        while (true) {
            InputStream ips = null;
            try {
                ips = socket.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(ips));
                System.out.println(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }

            OutputStream ops = null;
            try {
                ops = socket.getOutputStream();
                PrintStream ps = new PrintStream(ops);
                ps.println("服务器：你好客户端");
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
