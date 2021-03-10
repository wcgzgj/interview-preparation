package top.faroz.sort;

/**
 * @ClassName BubbleSort
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/3/10 下午1:15
 * @Version 1.0
 **/
public class BubbleSort {
    public int[] sort(int[] arr) {
        int len = arr.length;
        if (len<=1) {
            return arr;
        }
        //外层，为当前循环的最大值留位置
        for (int i = 1; i < len; i++) {
            //内层，将当前循环的最大值逼到最后
            for (int j = 0; j < len-1; j++) {
                if (arr[j]>arr[j+1]) {
                    int tmp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
        return arr;
    }
}
