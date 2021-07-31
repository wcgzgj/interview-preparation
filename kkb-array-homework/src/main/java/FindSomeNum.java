/**
 * @ClassName FindSomeNum
 * @Description TODO
 * @Author faro_z
 * @Date 2021/7/31 6:42 下午
 * @Version 1.0
 **/
public class FindSomeNum {
    public static void main(String[] args) {
        int[] arr = {3,2,1,4,6,5,3,2,1};
        System.out.println("找到的数的位置为:"+find(arr,6));
    }

    public static int find(int[] arr,int target) {
        if (arr==null || arr.length==0) return -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target) return i;
        }
        return -1;
    }
}
