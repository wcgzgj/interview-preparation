package top.faroz;

/**
 * @ClassName ThreadDemo3
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/5 上午12:50
 * @Version 1.0
 **/
public class ThreadDemo3 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }, "守护线程");
        /**
         * 将 t1 设置为守护线程
         * 一定要在 start 之前，进行守护线程的设置
         */
        t1.setDaemon(true);
        t1.start();

        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()+":"+i);
        }


    }
}
