package 流程控制的逻辑训练;

import java.awt.datatransfer.MimeTypeParseException;
import java.util.Arrays;

/**
 * @ClassName SortAndFind
 * @Description 排序并查找
 * @Author FARO_Z
 * @Date 2021/4/28 上午11:55
 * @Version 1.0
 **/
public class SortAndFind {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,9,5,6,7,15,4,8};
        sort(arr);
        System.out.println("排序后的数组为:"+Arrays.toString(arr));
        int index=-1;
        try {
            index = find(6, arr);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (index==-1) {
            System.out.println("未找到");
        } else {
            System.out.println("6的下标是:"+index);
        }
    }



    /**
     * 冒泡排序
     * @param arr
     */
    public static void sort(int[] arr) {
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < len - i; j++) {
                if (arr[j]>arr[j+1]) {
                    int tmp = arr[j + 1];
                    arr[j+1]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
    }

    /**
     * 二分查找，需要传入排序后的数组
     * @param target
     * @param arr
     * @return
     */
    public static int find(int target,int[] arr) throws Exception {
        if (!isSorted(arr)) throw new Exception("错误，请传入排好序后的数组");
        int l=0,r=arr.length-1;
        while (l<=r) {
            int mid = (l + r) / 2;
            if (arr[mid]==target) return mid;
            else if (arr[mid]<target) l++;
            else r--;
        }
        //如果没有找到，返回-1
        return -1;
    }

    /**
     * 判断该数组是否是有序数组
     * @param arr
     * @return
     */
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]>arr[i+1]) return false;
        }
        return true;
    }
}
