package 基本数据类型;

/**
 * @ClassName SumEachPlace
 * @Description 累加每位数
 * @Author FARO_Z
 * @Date 2021/4/27 下午10:27
 * @Version 1.0
 **/
public class SumEachPlace {
    public static void main(String[] args) {
        int[] data = {12345, 111, 2, 321};
        for (int i = 0; i < data.length; i++) {
            System.out.println(getSum(data[i]));
        }
    }

    public static int getSum(int num) {
        int sum=0;
        while (num>=1) {
            sum+=num%10;
            num=num/10;
        }
        return sum;
    }
}
