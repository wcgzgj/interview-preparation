package top.faroz.utils;

/**
 * @ClassName SortUtil
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/3/10 下午1:22
 * @Version 1.0
 **/
public class SortUtil {
    public static boolean isSorted(int[] arr) {
        if (arr.length<=1) {
            return true;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<arr[i-1]) {
                return false;
            }
        }
        return true;
    }
}
