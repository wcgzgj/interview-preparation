package LinkedListQuestion;

import LinkedListQuestion.domain.Node;

/**
 * @ClassName Q1
 * @Description 判断链表有环
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
}
