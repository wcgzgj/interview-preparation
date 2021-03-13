package LinkedListQuestion.data;

import LinkedListQuestion.domain.Node;

/**
 * @ClassName CircledList
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/3/13 下午12:27
 * @Version 1.0
 **/
public class CircledList {
    public static Node getList() {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(8);

        Node head = n5;
        n5.next=n3;
        n3.next=n7;
        n7.next=n2;
        n2.next=n6;
        n6.next=n8;
        n8.next=n1;
        n1.next=n2;

        return head;
    }
}
