package 流程控制的逻辑训练;

import java.util.Scanner;

/**
 * @ClassName TwoSum
 * @Description 两数之和
 * @Author FARO_Z
 * @Date 2021/4/28 上午11:43
 * @Version 1.0
 **/
public class TwoSum {
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

        //获取目标数
        System.out.println("请输入目标数:");
        int target = sc.nextInt();

        int[] indexs = getIndexs(target, arr);
        if (indexs==null) System.out.println("未找到");
        else System.out.println("找到的位置为:"+indexs[0] + "  " +indexs[1]);
    }

    /**
     * 查找
     * @param target
     * @param nums
     * @return
     */
    public static int[] getIndexs(int target,int[] nums) {
        int[] indexs = new int[2];
        indexs[0]=-1;
        indexs[1]=-1;
        for (int i = 0; i <nums.length-1 ; i++) {
            for (int j = i+1; j <nums.length; j++) {
                if (nums[i]+nums[j]==target) {
                    indexs[0]=i;
                    indexs[1]=j;
                }
            }
        }
        if (indexs[0]==-1) return null;
        else return indexs;
    }
}
