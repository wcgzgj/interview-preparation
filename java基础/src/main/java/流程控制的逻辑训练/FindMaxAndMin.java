package 流程控制的逻辑训练;

import java.util.Scanner;

/**
 * @ClassName FindMaxAndMin
 * @Description 查找最大值和最小值
 * @Author FARO_Z
 * @Date 2021/4/28 上午11:41
 * @Version 1.0
 **/
public class FindMaxAndMin {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入 10 个数");
        for (int i = 0; i < 10; i++) {
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < 10; i++) {
            if (arr[i]>max) max=arr[i];
            if (arr[i]<min) min=arr[i];
        }

        System.out.println("最大值为:"+max+"   最小值为:"+min);
    }
}
