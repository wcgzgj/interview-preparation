package 约瑟夫问题;

import java.util.Scanner;

/**
 * @ClassName JosephProblem
 * @Description 选队长游戏（经典的约瑟夫问题）
 * @Author FARO_Z
 * @Date 2021/4/28 上午10:40
 * @Version 1.0
 **/
public class JosephProblem {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //输入人数
        int num = sc.nextInt();
        if (num<1) throw new Exception("错误，输入人数应该大于 0");

        //构造循环链表
        Node head = buildLinkedList(num);
        int res = getLastPeople(head);
        System.out.println(res);


    }

    /**
     * 根据输入的人数，构造双向循环链表
     * @param num
     * @return
     */
    public static Node buildLinkedList(int num) {
        Node head=null;
        Node tail=null;
        for (int i = 1; i <= num; i++) {
            Node node = new Node(i);
            if (head==null) {
                head=node;
                tail=head;
            } else {
                tail.next=node;
                tail=tail.next;
            }
        }
        tail.next=head;
        return head;
    }

    public static int getLastPeople(Node head) {
        while (head.next!=head) {
            Node pre=head;
            for (int i = 0; i < 2; i++) {
                head=head.next;
                if (i!=0) {
                    pre=pre.next;
                }
            }
            Node tmp=head;
            head=head.next;
            //删除 tmp 节点（原 head 节点）
            pre.next=tmp.next;
        }
        return head.val;
    }


}

class Node {
    public int val;
    public Node next;

    public Node(int val) {
        this.val = val;
    }
}
