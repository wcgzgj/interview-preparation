package top.faroz;

import java.util.concurrent.*;

/**
 * @ClassName ThreadCreate
 * @Description TODO
 * @Author faro_z
 * @Date 2021/7/27 2:29 下午
 * @Version 1.0
 **/
public class ThreadCreate {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {

        /**
         * 实现 runnable 接口
         */
        new Thread(()-> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        },"实现 runnable 接口的 Thread").start();

        /**
         * 继承 Thread 类
         */
        Thread t2 = new TTThread();
        t2.setName("继承 Thread 类的线程");
        t2.start();

        /**
         * 实现 Callable 接口，返回线程执行结果
         */
        FutureTask<Integer> ft = new FutureTask<>(new CTThread());
        new Thread(ft).start();
        // 为 callable 设置超时时间，如果超过这个时间，callable 线程还没返回结果，就报错
        Integer res = ft.get(5, TimeUnit.SECONDS);
        System.out.println("callable 获得的计算结果为:"+res);

    }

}


class TTThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}


class CTThread implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int count=0;
        for (int i = 0; i < 10; i++) {
            count++;
        }
        Thread.sleep(10*1000);
        return count;
    }
}