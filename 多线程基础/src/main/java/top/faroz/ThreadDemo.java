package top.faroz;

import com.sun.javafx.robot.FXRobotImage;

/**
 * @ClassName ThreadDemo
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/4 下午9:37
 * @Version 1.0
 **/
public class ThreadDemo {
    public static void main(String[] args) {
        new ThreadClass().start();
        for (int i = 0; i < 10; i++) {
            System.out.println("锄禾日当午"+i);
        }
    }
}

class ThreadClass extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("汗滴禾下土"+i);
        }
    }
}
