package lru;

/**
 * @ClassName DoubleList
 * @Description TODO
 * @Author faro_z
 * @Date 2021/8/5 12:44 下午
 * @Version 1.0
 **/
public class DoubleList {
    private int size=0;

    DNode head = null;
    DNode tail = null;

    public DoubleList() {}

    public void addLast(DNode node) {
        if (head==null) {
            head=node;
            tail=head;
        } else {
            tail.next=node;
            tail.next.pre=tail;
            tail=tail.next;
        }
        ++size;
    }

    public DNode removeFirst() {
        if (size<=0) return null;
        DNode tmp = head;
        if (head.next==null) {
            head=null;
            tail=null;
        } else {
            head.next.pre=null;
            head=head.next;
            tmp.next=null;
        }
        -- size;
        return tmp;
    }

    public DNode removeLast() {
        if (size<=0) return null;
        DNode tmp=null;
        if (head==tail) {
            tmp=head;
            head=null;
            tail=null;
        } else {
            tmp=tail;
            tail=tail.pre;
            tail.next=null;
            tmp.pre=null;
        }
        return tmp;
    }

    /**
     * 因为我们一会要使用的 hash 表中
     * val 的类型就是 DNode
     * 所以我们这里直接使用 DNode 类型进行删除
     * @param n
     * @return
     */
    public DNode remove(DNode n) {
        if (n==null) return null;
        if (n.pre==null) return removeFirst();
        if (n.next==null) return removeLast();
        n.pre.next=n.next;
        n.next.pre=n.pre;
        n.next=null;
        n.pre=null;
        --size;
        return n;
    }

    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        DNode tmpHead = this.head;
        while (tmpHead!=null) {
            sb.append(tmpHead.val+" -> ");
            tmpHead=tmpHead.next;
        }
        return sb.toString();
    }
}
