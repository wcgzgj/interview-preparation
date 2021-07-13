package 链表;

import 链表.domain.Node;

/**
 * @ClassName Q1
 * @Description
 * @Author FARO_Z
 * @Date 2021/3/13 下午12:17
 * @Version 1.0
 **/
public class LinkedListUtil {
    public static boolean isCircled(Node head) {
        if (head==null) {
            return false;
        }
        Node fast = head;
        Node slow = head;
        while (slow!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if (fast==slow && !(fast==null && slow==null)) {
                return true;
            }
        }
        return false;
    }

    public static int getCircleLen(Node head) {
        if (head==null) {
            return 0;
        }
        Node fast = head;
        Node slow = head;
        while (slow!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if (fast==slow && !(fast==null && slow==null)) {
                fast=fast.next.next;
                slow=slow.next;
                int count=1;
                while (!(fast==slow)) {
                    fast=fast.next.next;
                    slow=slow.next;
                    count++;
                }
                return count;
            }
        }
        return 0;
    }

    /**
     * 获得环口
     * @param head
     * @return
     */
    public static Node getExit(Node head) {
        if (head==null) {
            return null;
        }
        Node fast = head;
        Node slow = head;
        while (slow!=null && fast.next!=null) {
            fast=fast.next.next;
            slow=slow.next;
            if (fast==slow &&(fast!=null&& slow!=null)) {
                Node node1 = head;
                Node node2 = fast;
                while (node1!=node2) {
                    node1=node1.next;
                    node2=node2.next;
                }
                return node1;
            }
        }
        return null;
    }
}
