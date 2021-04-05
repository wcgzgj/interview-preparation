package demo;

/**
 * @ClassName MissedRequest
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/5 上午11:48
 * @Version 1.0
 **/
public class SynchronizedObjectCodeBlock2 implements Runnable{
    private static int num=0;
    private static SynchronizedObjectCodeBlock2 instance=new SynchronizedObjectCodeBlock2();

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 10000; i++) {
                num++;
            }
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
