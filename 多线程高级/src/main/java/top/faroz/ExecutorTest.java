package top.faroz;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName ExecutorTest
 * @Description TODO
 * @Author faro_z
 * @Date 2021/7/27 3:49 下午
 * @Version 1.0
 **/
public class ExecutorTest {
    public static void main(String[] args) {

        //ExecutorService executorService = Executors.newCachedThreadPool();
        //for (int i = 0; i < 5; i++) {
        //    executorService.execute(new MyThread1());
        //}
        ////executorService.shutdown();

        ExecutorService executorService1 = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 5; i++) {
            executorService1.execute(new MyThread1());
        }

    }
}


/**
 * 等待被 Executor 管理的线程
 * 必须注意，这些线程不能操作同一个临界区
 * 因为 Executor 不能智能得处理同步问题
 */
class MyThread1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
