package 循环分支;


import java.util.Scanner;

/**
 * @ClassName CountElecCost
 * @Description 计算电费
 * @Author FARO_Z
 * @Date 2021/4/27 下午11:05
 * @Version 1.0
 **/
public class CountElecCost {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int use = sc.nextInt();
        if (use<0) throw new Exception("错误，电费用量应该大于 0");
        System.out.println("应缴电费:"+getCost(use));
    }

    /**
     * 计算电费
     * @param use 电费用量
     * @return
     */
    public static Double getCost(int use) {
        if (use<=150) return use*0.43;
        else if (use<=400) return 150*0.43+(use-150)*0.45;
        else return 150*0.43+250*0.45+(use-400)*0.52;
    }
}
