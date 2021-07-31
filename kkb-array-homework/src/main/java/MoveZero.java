import java.util.Arrays;

/**
 * @ClassName MoveZero
 * @Description TODO
 * @Author faro_z
 * @Date 2021/7/31 7:07 下午
 * @Version 1.0
 **/
public class MoveZero {
    public static void main(String[] args) {
        int []arr = {0,1,0,3,12};
        System.out.println("移动前:"+ Arrays.toString(arr));
        moveZero(arr);
        System.out.println("移动后:"+Arrays.toString(arr));
    }

    public static void moveZero(int []arr) {
        if (arr==null || arr.length==0) return;
        int l=0,r=0;
        while (r<arr.length) {
            if (arr[l]!=0) {
                l++;
                r++;
            } else {
                while (arr[r]==0) r++;
                if (r<arr.length) {
                    arr[l]=arr[r];
                    arr[r]=0;
                }
            }
        }
    }
}
