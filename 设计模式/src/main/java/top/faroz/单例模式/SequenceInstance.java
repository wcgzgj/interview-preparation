package top.faroz.单例模式;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName SqlInstance
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/3/25 下午6:47
 * @Version 1.0
 **/
public class SequenceInstance {
    private static SequenceInstance instance =null;
    private static final ReentrantLock lock=new ReentrantLock();
    /**
     * 存放已经生成的序列单号
     */
    Set<Integer> ids = new HashSet<Integer>();

    /**
     * 随机化对象
     */
    Random r = new Random();


    public static SequenceInstance getInstance() {
        lock.lock();
        try {
            if (instance==null) {
                instance=new SequenceInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        return instance;
    }


    public int getUniqueId() {
        int val=0;
        lock.lock();
        try {
            val = r.nextInt(Integer.MAX_VALUE);
            while (ids.contains(val)) {
                val=r.nextInt(Integer.MAX_VALUE);
            }
            ids.add(val);
        } catch (Exception e) {

        } finally {
            lock.unlock();
        }
        return val;
    }


}
