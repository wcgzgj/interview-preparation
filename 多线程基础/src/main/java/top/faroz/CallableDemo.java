package top.faroz;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @ClassName CallableDemo
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/5 下午3:53
 * @Version 1.0
 **/
public class CallableDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        MyCallable cl = new MyCallable();
        FutureTask<Integer> task = new FutureTask<>(cl);
        //执行子线程
        new Thread(task).start();
        Integer res = task.get();
        System.out.println("子线程计算结果为:"+res);
        for (int i = 0; i < 10; i++) {
            Thread.sleep(100);
            System.out.println("main"+i);
        }

    }
}

class MyCallable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            System.out.println("子线程正在执行"+i);
        }
        return 100;
    }
}
