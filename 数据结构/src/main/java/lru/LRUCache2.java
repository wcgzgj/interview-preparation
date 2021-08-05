package lru;

import java.util.LinkedHashMap;

/**
 * @ClassName LRUCache2
 * @Description TODO
 * @Author faro_z
 * @Date 2021/8/5 3:34 下午
 * @Version 1.0
 **/
public class LRUCache2 {
    LinkedHashMap<Integer, Integer> cache = new LinkedHashMap<Integer, Integer>();

    private int capacity;

    public LRUCache2(int capacity) {
        this.capacity = capacity;
    }

    /**
     * 获取元素
     * @param key
     * @return
     */
    public int get(int key) {
        if (cache.get(key)==null) return -1;
        makeRecent(key);
        return cache.get(key);
    }

    /**
     * 放置元素
     * 一定要注意 cache 的大小
     * @param key
     * @param val
     */
    public void put(int key,int val) {
        if (cache.get(key)!=null) {
            cache.put(key,val);
            makeRecent(key);
            return;
        }
        if (cache.size()>=capacity) {
            // 获取当前 set 中
            Integer firstKey = cache.keySet().iterator().next();
            cache.remove(firstKey);
        }
        cache.put(key,val);
    }

    /**
     * 将当前 key 升级为最近使用
     * @param key
     */
    public void makeRecent(int key) {
        Integer val = cache.get(key);
        // 删除 key，放到最近使用
        cache.remove(key);
        cache.put(key,val);
    }

    @Override
    public String toString() {
        return cache.toString();
    }
}
