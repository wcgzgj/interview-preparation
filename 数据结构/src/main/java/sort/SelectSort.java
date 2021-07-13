package sort;

/**
 * @ClassName SelectSort
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/3/10 下午1:15
 * @Version 1.0
 **/
public class SelectSort {
    /**
     * 选择最小
     * @param arr
     * @return
     */
    public int[] sort(int[] arr) {
        int len = arr.length;
        if (len<=1) {
            return arr;
        }
        for (int i = 0; i < len; i++) {
            int minIndex = i;
            for (int j = i; j < len; j++) {
                if (arr[j]<arr[minIndex]) {
                    minIndex=j;
                }
            }
            int tmp = arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=tmp;
        }
        return arr;
    }
}
