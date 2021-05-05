package top.faroz;


/**
 * @ClassName ThreadDemo4
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/5 上午1:04
 * @Version 1.0
 **/
public class ThreadDemo5 {
    public static void main(String[] args) {

        MyThread2 t = new MyThread2();

        new Thread(t,"A").start();
        new Thread(t,"B").start();
        new Thread(t,"C").start();

    }
}

class MyThread2 implements Runnable {

    private int ticket = 10;

    /**
     * 锁的对象，是要是唯一的，都可以
     * 有时候为了不使用自定义的锁，甚至可以使用 Class 作为锁
     * 比如使用 MyThread2.class
     */
    private static final Object lock = new Object();



    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
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
            }
        }
    }
}
