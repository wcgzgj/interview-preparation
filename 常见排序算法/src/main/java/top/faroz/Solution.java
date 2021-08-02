package top.faroz;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Random;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author faro_z
 * @Date 2021/8/2 10:57 上午
 * @Version 1.0
 **/
public class Solution {
    private static final Random r = new Random();

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Solution solution = new Solution();
        Method[] methods = solution.getClass().getDeclaredMethods();

        // 执行所有排序的函数
        for (Method method : methods) {
            if (method.getName().contains("Sort")) {
                int[] arr = generateRandomArr(10);
                System.out.println("排序前为:"+ Arrays.toString(arr));
                method.invoke(int[].class,arr);
                System.out.println("经过 "+method.getName()+" 排序后为:"+Arrays.toString(arr));
                System.out.println("\n--------\n");
            }
        }
    }

    // 生成随机数组序列，范围为0-100
    public static int[] generateRandomArr(int n) {
        if (n<=0) return new int[0];
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i]=r.nextInt(100);
        }
        return res;
    }


    // 冒泡排序
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j]>arr[j+1]) {
                    int tmp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
    }

    // 选择排序(选择最小)
    public static void selectSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int min=arr[i];
            int minIndex=i;
            for (int j = i+1; j < n; j++) {
                if (arr[j]<min) {
                    min=arr[j];
                    minIndex=j;
                }
            }
            if (i!=minIndex) {
                int tmp = arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=tmp;
            }
        }
    }

    // 插入排序(插入有序)
    public static void insertSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j >0; j--) {
                if (arr[j]<arr[j-1]) {
                    int tmp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=tmp;
                }
            }
        }
    }

    // 希尔排序
    public static void shellSort(int[] arr) {

    }

    // 归并排序
    // 归并排序的思想，是一种分治的思想
    // 其大致思路是将一个序列的左边排好序，右边排好序，然后将两边进行归并
    public static void mergeSort(int []arr) {
        // 为了让所有函数都能跑 main 中的测试序列，必须在外面包一层
        mergeRecursion(arr,0,arr.length-1);
    }

    private static void mergeRecursion(int[] arr,int l,int r) {
        // 递归终止
        if (l>=r) return;
        int mid = (l + r)/2;
        // 左边排好序
        mergeRecursion(arr,l,mid);
        // 右边排好序
        mergeRecursion(arr,mid+1,r);
        // 两边进行归并
        merge(arr,l,mid,r);
    }

    // 归并函数
    // ls: 左边起始   le: 左边终止   re: 右边终止
    // 归并函数，我们需要借助一个辅助数组
    // 在辅助数组中归并完了，再去替换原位置的数
    private static void merge(int[]arr,int ls,int le,int re) {
        // 记录下开始和结束的位置
        // 方便我们最后进行辅助数组的数据替换
        int start = ls;
        int end = re;

        int rs=le+1;
        int n = re - ls + 1;
        // 辅助数组
        int[] tmp = new int[n];
        int index = 0;
        while (ls<=le && rs<=re) {
            if (arr[ls]<=arr[rs]) {
                tmp[index]=arr[ls];
                ls++;
            } else {
                tmp[index]=arr[rs];
                rs++;
            }
            index++;
        }
        // 收尾工作
        // 这里收尾的时候，是 <= 不是 <
        // 因为 == 的时候，也说明最后一个元素没有被考虑到
        if (ls<=le) {
            while (ls<=le) {
                tmp[index]=arr[ls];
                ls++;
                index++;
            }
        }
        if (rs<=re) {
            while (rs<=re) {
                tmp[index]=arr[rs];
                rs++;
                index++;
            }
        }
        // 将辅助函数的所有元素，替换原来的位置
        index = 0;
        for (int i = start; i <= end; i++) {
            arr[i]=tmp[index];
            index++;
        }
    }

    // 快速排序
    public static void quickSort(int[] arr) {

    }

}
