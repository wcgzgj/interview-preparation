package lru;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName LRUCache
 * @Description TODO
 * @Author faro_z
 * @Date 2021/8/5 12:46 下午
 * @Version 1.0
 **/
public class LRUCache {
    private DoubleList cache = new DoubleList();
    private int capacity;
    Map<Integer, DNode> map = new HashMap<Integer, DNode>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    /**
     * 将某个节点，提升为最近使用的节点
     * @param key
     */
    private void makeRecent(int key) {
        DNode node = map.get(key);
        if (node==null) return;
        // 先删除该节点
        cache.remove(node);
        // 再将该节点，提到 cache 的最后，表示最近使用
        cache.addLast(node);
    }

    /**
     * 删除最少用的节点
     * @return
     */
    private DNode removeLastUse() {
        if (cache.size()<=0) return null;
        DNode delNode = cache.removeFirst();
        // 一定要记得，删除 map 中该 node 的 key 索引
        map.remove(delNode.key);
        return delNode;
    }

    /**
     * 插入最近使用的节点
     * @param key
     * @param val
     */
    private void insertRecent(int key,int val) {
        DNode node = new DNode(key, val);
        // 如果满了，要删去一个节点
        if (cache.size()>=capacity) {
            removeLastUse();
        }
        cache.addLast(node);
        // 别忘了在 map 中添加该节点的索引
        map.put(key,node);
    }


    /**
     * 对外暴露的 lru get 方法
     * @param key
     * @return 返回对应的 val
     */
    public int get(int key) {
        if (map.get())
    }





}
