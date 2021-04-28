package 流程控制的逻辑训练;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName RemoveZero
 * @Description 将数组中所有的 0 移动到最后
 * @Author FARO_Z
 * @Date 2021/4/28 下午12:59
 * @Version 1.0
 **/
public class RemoveZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //获取数组
        System.out.println("请输入个数:");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("请输入"+len+"个数:");
        for (int i = 0; i < len; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("输入的数组为:"+ Arrays.toString(arr));

        removeZero(arr);
        System.out.println("将所有0移动到最后的数组为:"+Arrays.toString(arr));
    }

    public static void removeZero(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            
        }
    }
}
