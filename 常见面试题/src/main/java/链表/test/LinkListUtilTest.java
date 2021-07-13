package 链表.test;

import 链表.LinkedListUtil;
import 链表.data.CircledList;
import 链表.data.NormalList;
import 链表.domain.Node;
import org.junit.Test;

/**
 * @ClassName LinkListUtilTest
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/3/13 下午12:31
 * @Version 1.0
 **/
public class LinkListUtilTest {
    @Test
    public void isCircledListTest() {
        Node head = CircledList.getList();
        Node head2 = NormalList.getList();
        System.out.println(LinkedListUtil.isCircled(head));
        System.out.println(LinkedListUtil.isCircled(head2));
    }

    @Test
    public void getCircleLenTest() {
        Node head = CircledList.getList(21,1);
        System.out.println(LinkedListUtil.getCircleLen(head));
    }

    @Test
    public void getExitTest() {
        Node head = CircledList.getList(10, 4);
        Node exit = LinkedListUtil.getExit(head);
        System.out.println(exit.data);

    }
}
