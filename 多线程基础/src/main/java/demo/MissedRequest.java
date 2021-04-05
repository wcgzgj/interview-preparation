package demo;

/**
 * @ClassName MissedRequest
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/5 上午11:48
 * @Version 1.0
 **/
public class MissedRequest {
    private static int num=0;

    public static void main(String[] args) throws InterruptedException {
        Thread a = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                num++;
            }
        }, "A");

        Thread b = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                num++;
            }
        }, "B");

        a.start();
        b.start();

        /**
         * 使用join方法，是为了保证子线程能在主线程之前完成
         * 在这里，因为a.start()方法，是在main线程里执行的
         * 所以，主线程是main,子线程是A,B
         */
        a.join();
        b.join();

        while (a.isAlive() || b.isAlive()) {

        }

        System.out.println(num);
    }
}
