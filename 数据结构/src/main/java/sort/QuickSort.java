package sort;

/**
 * @ClassName QuickSort
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/3/10 下午1:15
 * @Version 1.0
 **/
public class QuickSort {
    public int[] sort(int[] arr,int begin,int end) {
        if (begin>=end) {
            return arr;
        }
        int pivot = partition(arr, begin, end);
        sort(arr,begin,pivot-1);
        sort(arr,pivot+1,end);
        return arr;
    }

    // ???????
    /**
     * 双向扫描
     * @param arr
     * @param begin
     * @param end
     * @return pivot
     */
    public int partition(int[] arr,int begin,int end) {
        int pivot = arr[begin];
        int left = begin+1;
        int right = end;
        while (left!=right) {
            while (left<right && arr[left]<=arr[pivot]) {
                left++;
            }
            while (left<right && arr[right]>arr[pivot]) {
                right--;
            }
            if (left<right) {
                int tmp = arr[left];
                arr[left]=arr[right];
                arr[right]=tmp;
            }
        }
        arr[begin]=arr[left];
        arr[left]=pivot;
        return left;
    }

}
