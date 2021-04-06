package demo;

import lombok.Synchronized;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName LockAndSynchronized
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/6 上午11:14
 * @Version 1.0
 **/
public class LockAndSynchronized {
    Lock lock = new ReentrantLock();

    public synchronized void method1() {
        //实现
    }

    public void method2() {
        lock.lock();
        try {
            //实现
        } catch (Exception e) {

        } finally {
            lock.unlock();
        }
    }


}
