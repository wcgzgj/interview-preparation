package 常用类;

import java.math.BigDecimal;

/**
 * @ClassName BigDecimalDemo
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/2 下午2:15
 * @Version 1.0
 **/
public class BigDecimalDemo {
    public static void main(String[] args) {
        // System.out.println(0.1+0.2);
        BigDecimal d1 = new BigDecimal("0.1");
        BigDecimal d2 = new BigDecimal("0.2");
        BigDecimal addRes = d1.add(d2);
        BigDecimal subRes = d1.subtract(d2);
        BigDecimal mulRes = d1.multiply(d2);
        BigDecimal divRes = d1.divide(d2);
        System.out.println(addRes.doubleValue());
    }
}
