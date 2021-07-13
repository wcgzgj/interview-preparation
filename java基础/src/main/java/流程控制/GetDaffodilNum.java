package 流程控制;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName GetDaffodilNum
 * @Description 获得三位数中的所有水仙花数
 * @Author FARO_Z
 * @Date 2021/4/27 下午11:34
 * @Version 1.0
 **/
public class GetDaffodilNum {
    public static void main(String[] args) {
        System.out.println("三位数中所有水仙花数为:"+getDaffodilNum().toString());
    }

    public static List<Integer> getDaffodilNum() {
        List<Integer> list = new ArrayList<>();
        for (int i = 100; i < 1000; i++) {
            if (isDaffodilNum(i)) list.add(i);
        }
        return list;
    }

    /**
     * 判断该数是否为水仙花数
     * @param num
     * @return
     */
    public static boolean isDaffodilNum(int num) {
        List<Integer> list = new ArrayList<>();
        int numTmp = num;
        while (num>=1) {
            list.add(num%10);
            num=num/10;
        }
        int sum=0;
        for (Integer integer : list) {
            sum+=getSquare(integer);
        }
        return numTmp==sum;
    }

    /**
     * 获得立方
     * @param num
     * @return
     */
    public static int getSquare(int num) {
        return num*num*num;
    }
}
