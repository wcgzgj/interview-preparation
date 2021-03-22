package 栈和队列.最小栈问题;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

/**
 * @ClassName MyStackTest
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/3/13 下午3:47
 * @Version 1.0
 **/
public class MyStackTest {
    @Test
    public void stackTest() {
        int[] arr = new int[10];
        Random r = new Random();
        MyStack stack = new MyStack();
        for (int i = 0; i < 10; i++) {
            arr[i]=r.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < 10; i++) {
            stack.push(arr[i]);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("弹出元素："+stack.pop());
            System.out.println("最小元素："+stack.getMin());
            System.out.println();
        }
    }
}
