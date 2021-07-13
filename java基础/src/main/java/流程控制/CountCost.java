package 流程控制;


import java.util.Scanner;

/**
 * @ClassName CountCost
 * @Description 计算应缴金额
 * @Author FARO_Z
 * @Date 2021/4/27 下午11:13
 * @Version 1.0
 **/
public class CountCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int use = sc.nextInt();
        int integral = sc.nextInt();
        System.out.println("应缴纳金额为:"+getCost(use,integral));
    }

    /**
     * 计算费用
     * @param use 金额
     * @param integral 折扣
     * @return
     */
    public static Double getCost(int use,int integral) {
        if (integral<=2000) return use*0.9;
        else if (integral<=4000) return use*0.8;
        else if (integral<=8000) return use*0.75;
        else return use*0.7;
    }
}
