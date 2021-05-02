package 常用类;

import java.util.Arrays;

/**
 * @ClassName ArraysDemo
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/2 下午2:06
 * @Version 1.0
 **/
public class ArraysDemo {
    public static void main(String[] args) {
        // int[] arr={3,6,23,7,0,65,1};
        // System.out.println(Arrays.toString(arr));
        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        // System.out.println(Arrays.binarySearch(arr,23));
        int[] arr={3,6,23,7,0,65,1};
        System.out.println(arr.length);
        arr = Arrays.copyOf(arr, 20);
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
