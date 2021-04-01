package top.faroz.单例模式;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName SqlInstance
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/3/25 下午6:47
 * @Version 1.0
 **/
public class SqlInstance {
    private static SqlInstance instance =null;
    private static final ReentrantLock lock=new ReentrantLock();


    public static SqlInstance getInstance() {
        lock.lock();
        try {
            if (instance==null) {
                instance=new SqlInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

        return instance;
    }

    // /**
    //  * 读操作
    //  * @return
    //  */
    // public List select(criteria) {
    //     ...
    // }
    //
    // /**
    //  * 写操作
    //  * @return
    //  */
    // public int insert(value) {
    //     ...
    // }
}
