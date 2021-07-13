package top.faroz;


/**
 * @ClassName JoinDemo
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/5 下午2:04
 * @Version 1.0
 **/
public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "子线程");

        t.start();
        t.join(2000);


        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(1000);
        }
    }
}
