package top.faroz.sort;

/**
 * @ClassName InsertSort
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/3/10 下午1:15
 * @Version 1.0
 **/
public class InsertSort {
    /**
     * 插入有序
     * @param arr
     * @return
     */
    public int[] sort(int[] arr) {
        //一：我按照自己的理解写出的插入排序
        // int len = arr.length;
        // if (len<=1) {
        //     return arr;
        // }
        // for (int i = 1; i < len; i++) {
        //     int j = i;
        //     while (j>0 && arr[j]<arr[j-1]) {
        //         int tmp = arr[j];
        //         arr[j]=arr[j-1];
        //         arr[j-1]=tmp;
        //         j--;
        //     }
        // }
        // return arr;

        //二：网上的插入排序
        int len = arr.length;
        if (len <=1) {
            return arr;
        }
        for (int i = 1; i < len; i++) {
            int curr=arr[i];
            int preIndex = i - 1;
            while (preIndex>=0 && arr[preIndex]>curr) {
                arr[preIndex+1]=arr[preIndex];
                preIndex--;
            }
            arr[preIndex+1]=curr;
        }
        return arr;
    }
}
