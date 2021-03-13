package LinkedListQuestion.test;

import LinkedListQuestion.LinkedListUtil;
import LinkedListQuestion.data.CircledList;
import LinkedListQuestion.data.NormalList;
import LinkedListQuestion.domain.Node;
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
}
