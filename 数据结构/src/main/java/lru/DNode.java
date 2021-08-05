package lru;

/**
 * @ClassName DNode
 * @Description TODO
 * @Author faro_z
 * @Date 2021/8/5 12:43 下午
 * @Version 1.0
 **/
public class DNode {
    // 节点中存储 key 值，是为了方便在 哈希链表中，删除 hash 表中的 key 值
    public Integer key;
    public Integer val;
    public DNode next;
    public DNode pre;

    public DNode(Integer val) {
        this.val = val;
    }

    public DNode(Integer key, Integer val) {
        this.key = key;
        this.val = val;
    }
}
