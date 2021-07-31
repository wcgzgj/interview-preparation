import java.util.Arrays;

/**
 * @ClassName TwoSum
 * @Description TODO
 * @Author faro_z
 * @Date 2021/7/31 6:54 下午
 * @Version 1.0
 **/
public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        System.out.println("找到的下标为:"+Arrays.toString(twoSum(arr,9)));
    }

    public static int[] twoSum(int []arr,int target) {
        if (arr==null || arr.length<2) return null;
        int[] res = new int[2];
        Arrays.sort(arr);
        int l = 0;
        int r = arr.length - 1;
        while (l<r) {
            int tmp = arr[l] + arr[r];
            if (tmp==target) {
                res[0]=l;
                res[1]=r;
                return res;
            } else if (tmp<target) {
                l++;
            } else if (tmp>target) {
                r--;
            }
        }
        return null;
    }
}
