package top.faroz;

/**
 * @ClassName Solution1
 * @Description TODO
 * @Author faro_z
 * @Date 2021/7/29 8:56 下午
 * @Version 1.0
 **/
public class Solution1 {
    public static void main(String[] args) {

        System.out.println(getAllCoins(5));
        System.out.println(getAllCoins(10));
        System.out.println(getAllCoins(15));

    }

    public static int getAllCoins(int n) {
        int dayCount=1;
        int allCount=0;
        int coins=0;
        while (allCount<=n) {
            for (int i = 1; i <= dayCount; i++) {
                coins+=dayCount;
                allCount++;
            }
            dayCount++;
        }
        return coins;
    }
}
