package 栈和队列.最小栈问题;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @ClassName MyStack
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/3/13 下午3:35
 * @Version 1.0
 **/
public class MyStack {
    LinkedList<Integer> A = new LinkedList<Integer>();
    LinkedList<Integer> B = new LinkedList<Integer>();

    public void push(int x) {
        A.offer(x);
        if (B.size()==0) {
            B.offer(x);
            return;
        }
        if (x<=B.getLast()) {
            B.offer(x);
        }
    }

    public Integer getMin() {
        if (B.size()==0) {
            return null;
        }
        return B.getLast();
    }

    public Integer pop() {
        if (A.getLast().equals(B.getLast())) {
            B.removeLast();
            return A.removeLast();
        }
        return A.removeLast();
    }
}
