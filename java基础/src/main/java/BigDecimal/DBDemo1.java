package BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @ClassName DBDemo1
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/7/3 下午4:56
 * @Version 1.0
 **/
public class DBDemo1 {
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("23");
        BigDecimal num2 = new BigDecimal("2");
        BigDecimal num3 = new BigDecimal("3");
        BigDecimal num10 = new BigDecimal("3");

        /**
         * 比较大小
         * 大于，返回1
         * 小于，返回-1
         * 等于，返回0
         * 不要使用 equals 方法进行比较
         */
        System.out.println(num1.compareTo(num2)); // 1
        System.out.println(num2.compareTo(num1)); // -1
        System.out.println(num1.compareTo(num1)); // 0

        /**
         * 加
         */
        System.out.println(num1.add(num2));

        /**
         * 减
         */
        System.out.println(num1.subtract(num2));

        /**
         * 乘
         */
        System.out.println(num1.multiply(num2));

        /**
         * 除
         */
        System.out.println(num1.divide(num2));

        /**
         * 如果除法的结果是无限小数，且没有给范围，会报错
         * 需要给无尽小数的结果一个范围
         * RoundingMode.HALF_UP: 四舍五入
         * RoundingMode.DOWN: 直接截取
         */
        // num1.divide(num3);  因为答案是 7.666... 所以会报错
        System.out.println(num1.divide(num3,10, RoundingMode.HALF_UP));

        /**
         * 做除法，取余数
         */
        BigDecimal[] res = num1.divideAndRemainder(num3);
        System.out.println("商："+res[0]); // 7
        System.out.println("余数："+res[1]); // 2


        /**
         * 统计小数位
         */
        BigDecimal num4 = new BigDecimal("234.9999");
        System.out.println(num4.scale()); // 4

        /**
         * 小数位去末尾的 0
         */
        BigDecimal num5 = new BigDecimal("234.99000");
        System.out.println(num5.stripTrailingZeros()); // 234.99

    }
}
