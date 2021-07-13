package 循环分支;


import java.util.Scanner;

/**
 * @ClassName CountTaxiCost
 * @Description 计算计程车费用
 * @Author FARO_Z
 * @Date 2021/4/27 下午10:47
 * @Version 1.0
 **/
public class CountTaxiCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //路程长度
        int len = sc.nextInt();
        System.out.println("总共需要车费:"+getCost(len));
    }

    public static Double getCost(int len) {
        if (len<=2) return Double.valueOf(8);
        return (len-2)*4.5+8;
    }
}
