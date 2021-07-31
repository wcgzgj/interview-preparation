/**
 * @ClassName FindMaxAndMin
 * @Description TODO
 * @Author faro_z
 * @Date 2021/7/31 6:45 下午
 * @Version 1.0
 **/
public class FindMaxAndMin {
    public static void main(String[] args) throws Exception {
        int[] arr = {3,1,3,4,6,7,3,21,0,-2};
        int[] maxAndMin = findMaxAndMin(arr);
        System.out.println("最小值位置为:"+maxAndMin[0]);
        System.out.println("最大值位置为:"+maxAndMin[1]);
        System.out.println("------");
        System.out.println("最小值为:"+arr[maxAndMin[0]]);
        System.out.println("最大值为:"+arr[maxAndMin[1]]);
    }

    public static int[] findMaxAndMin(int[] arr) throws Exception {
        if (arr==null || arr.length<2) throw new Exception("错误，数组长度至少为2");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int[] res = new int[2];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                res[1]=i;
                max=arr[i];
            }
            if (arr[i]<min) {
                res[0]=i;
                min=arr[i];
            }
        }

        return res;
    }
}
