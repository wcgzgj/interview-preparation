package demo;

/**
 * @ClassName MissedRequest
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/5 上午11:48
 * @Version 1.0
 **/
public class SynchronizedObjectCodeBlock1 {
    private static int num=0;

    private static final Object lock1=new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread a = new Thread(() -> {
            synchronized (lock1) {
                for (int i = 0; i < 10000; i++) {
                    num++;
                }
            }
        }, "A");

        Thread b = new Thread(() -> {
            synchronized (lock1) {
                for (int i = 0; i < 10000; i++) {
                    num++;
                }
            }
        }, "B");

        a.start();
        b.start();

        /**
         * 使用join方法，是为了保证子线程能在主线程之前完成
         * 在这里，因为a.start()方法，是在main线程里执行的
         * 所以，主线程是main,子线程是A,B
         */
        // a.join();
        // b.join();

        /**
         * 也可以使用下面这种方法
         * 当前面的线程还在执行的时候，不会跳出这个循环
         * 从而保证输出会在所有子线程结束后才会执行
         */
        while (a.isAlive() || b.isAlive()) {

        }

        System.out.println(num);
    }
}
