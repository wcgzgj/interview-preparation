package sort;

/**
 * @ClassName ShellSort
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/3/10 下午1:16
 * @Version 1.0
 **/
public class ShellSort {
    /**
     * 分割+插入排序
     * @param arr
     * @return
     */
    public int[] sort(int[] arr) {
        int len = arr.length;
        if (len<=1) {
            return arr;
        }
        int gap = len / 2;
        while (gap>0) {
            for (int i = gap; i < len; i++) {
                int curr = arr[i];
                int preIndex = i - gap;
                while (preIndex>=0 && arr[preIndex]>curr) {
                    arr[preIndex+gap]=arr[preIndex];
                    preIndex-=gap;
                }
                //为待选数，在前面已经排好的数组中找到了位置
                arr[preIndex+gap]=curr;
            }
            gap/=2;
        }
        return arr;
    }
}
