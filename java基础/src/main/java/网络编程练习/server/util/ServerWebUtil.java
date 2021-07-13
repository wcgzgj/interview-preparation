package 网络编程练习.server.util;

import java.io.*;
import java.net.Socket;

/**
 * @ClassName ServerWebUtil
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/5 下午10:43
 * @Version 1.0
 **/
public class ServerWebUtil {
    private Socket socket;

    public ServerWebUtil(Socket socket) {
        this.socket = socket;
    }

    /**
     * 发送序列化后的对象
     * @param o
     */
    public void sendObject(Object o) {
        OutputStream ops = null;
        try {
            ops = socket.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(ops);
            oos.writeObject(o);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 读取传来的对象
     * @return
     */
    public Object getObject() {
        Object o = null;
        try {
            InputStream ips = socket.getInputStream();
            ObjectInputStream ois = new ObjectInputStream(ips);
            o = ois.readObject();
        } catch (IOException e) {
            // e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return o;
    }
}
