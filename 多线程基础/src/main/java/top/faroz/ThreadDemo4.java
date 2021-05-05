package top.faroz;

/**
 * @ClassName ThreadDemo4
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/5 上午1:04
 * @Version 1.0
 **/
public class ThreadDemo4 {
    public static void main(String[] args) {

        MyThread t = new MyThread();

        new Thread(t,"A").start();
        new Thread(t,"B").start();
        new Thread(t,"C").start();

    }
}

class MyThread implements Runnable {

    private int ticket = 10;

    @Override
    public void run() {
        while (ticket>0) {
            System.out.println(Thread.currentThread().getName()+"开始卖票");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ticket--;
            System.out.println(Thread.currentThread().getName()+"余票:"+ticket);
        }
    }
}
