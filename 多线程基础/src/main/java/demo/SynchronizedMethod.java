package demo;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName MissedRequest
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/5 上午11:48
 * @Version 1.0
 **/
public class SynchronizedMethod implements Runnable{
    private static int num=0;
    private static SynchronizedMethod instance=new SynchronizedMethod();

    @Override
    public void run() {

    }

    public synchronized void method() {
        System.out.println();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws InterruptedException {
        Thread a = new Thread(instance,"A");
        Thread b = new Thread(instance,"B");

        a.start();
        b.start();

        while (a.isAlive() || b.isAlive()) {

        }

        System.out.println(num);
    }


}
