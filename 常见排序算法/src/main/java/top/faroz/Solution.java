package top.faroz;

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
                System.out.println("经过"+method.getName()+"排序后为:"+Arrays.toString(arr));
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

    public static void quickSort(int[] arr) {

    }
}
