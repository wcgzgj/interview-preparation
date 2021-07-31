import java.util.Arrays;

/**
 * @ClassName BinSearch
 * @Description TODO
 * @Author faro_z
 * @Date 2021/7/31 7:03 下午
 * @Version 1.0
 **/
public class BinSearch {
    public static void main(String[] args) {
        int[] arr = {1,3,9,5,6,7,15,4,8};
        int index = find(arr, 6);
        System.out.println("6 的位置在:"+index);

    }

    public static int find(int[] arr,int target) {
        Arrays.sort(arr);
        int l=0,r=arr.length-1;
        while (l<=r) {
            int mid = (l + r) / 2;
            if (arr[mid]==target) return mid;
            else if (arr[mid]<target) ++l;
            else if (arr[mid]>target) --r;
        }
        return -1;
    }
}
