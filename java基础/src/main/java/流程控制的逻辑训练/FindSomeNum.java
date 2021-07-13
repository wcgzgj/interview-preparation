package 流程控制的逻辑训练;


import java.util.Scanner;

/**
 * @ClassName FindSomeNum
 * @Description 查找某一数
 * @Author FARO_Z
 * @Date 2021/4/28 上午11:37
 * @Version 1.0
 **/
public class FindSomeNum {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("请输入要查找的数:");

        //要去查找的数
        int find = sc.nextInt();
        int index=-1;
        for (int i = 0; i <10 ; i++) {
            if (arr[i]==find) index=i;
        }
        if (index==-1) System.out.println("没有找到");
        else System.out.println("已找到，下标为:"+index);
    }
}
