package top.faroz.sort;

import java.util.Arrays;

/**
 * @ClassName MergeSort
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/3/10 下午1:15
 * @Version 1.0
 **/
public class MergeSort {
    public int[] sort(int[] arr) {
        //边界条件
        if (arr.length<2) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        //合并+递归
        return merge(sort(left), sort(right));
    }

    /**
     * 合并两个排好序的数组
     * @param left
     * @param right
     * @return
     */
    public int[] merge(int[] left,int[] right) {
        int len = left.length + right.length;
        int[] res = new int[len];
        int i=0,l=0,r=0;

        //合并有序
        while (l<left.length && r<right.length) {
            if (left[l]<=right[r]) {
                res[i++]=left[l++];
            } else {
                res[i++]=right[r++];
            }
        }
        //收尾
        while (l<left.length) {
            res[i++]=left[l++];
        }
        while (r<right.length) {
            res[i++]=right[r++];
        }
        return res;
    }
}
