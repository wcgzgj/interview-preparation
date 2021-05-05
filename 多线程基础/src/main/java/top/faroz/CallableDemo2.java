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
public class CallableDemo2 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        MyCallable2 cl = new MyCallable2();
        FutureTask<Integer> task = new FutureTask<>(cl);
        new Thread(task).start();
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            if (task.isDone()) {
                Integer res = task.get();
                System.out.println("子线程已经执行完了，结果是:"+res);
            }
            System.out.println("main"+i);
        }

    }
}

class MyCallable2 implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        for (int i = 0; i < 10; i++) {
            Thread.sleep(500);
            // System.out.println("子线程正在执行"+i);
        }
        return 100;
    }
}
