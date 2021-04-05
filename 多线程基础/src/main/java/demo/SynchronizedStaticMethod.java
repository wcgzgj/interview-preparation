package demo;

/**
 * @ClassName MissedRequest
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/5 上午11:48
 * @Version 1.0
 **/
public class SynchronizedStaticMethod implements Runnable{
    private static SynchronizedStaticMethod instance1=new SynchronizedStaticMethod();
    private static SynchronizedStaticMethod instance2=new SynchronizedStaticMethod();

    @Override
    public void run() {
        method();
    }

    public synchronized static void method() {
        try {
            System.out.println("进入线程："+Thread.currentThread().getName());
            Thread.sleep(2000);
            System.out.println("退出线程："+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread a = new Thread(instance1,"A");
        Thread b = new Thread(instance2,"B");

        a.start();
        b.start();

    }
}
