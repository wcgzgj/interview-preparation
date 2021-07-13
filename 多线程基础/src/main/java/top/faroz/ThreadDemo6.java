package top.faroz;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName ThreadDemo4
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/5 上午1:04
 * @Version 1.0
 **/
public class ThreadDemo6 {
    public static void main(String[] args) {

        MyThread3 t = new MyThread3();

        new Thread(t,"A").start();
        new Thread(t,"B").start();
        new Thread(t,"C").start();

    }
}

class MyThread3 implements Runnable {

    private int ticket = 10;

    private Lock lock = new ReentrantLock();

    @Override
    public void run() {

        while (true) {
            lock.lock();
            if (ticket<=0) break;
            else {
                System.out.println(Thread.currentThread().getName()+"开始卖票");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ticket--;
                System.out.println(Thread.currentThread().getName()+"余票:"+ticket);
            }
            lock.unlock();
        }
    }
}
