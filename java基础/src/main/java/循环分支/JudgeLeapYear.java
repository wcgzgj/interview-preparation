package 循环分支;


import java.util.Scanner;

/**
 * @ClassName JudgeLeapYear
 * @Description 判断是否是闰年
 * @Author FARO_Z
 * @Date 2021/4/27 下午10:51
 * @Version 1.0
 **/
public class JudgeLeapYear {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year<0) throw new Exception("输入错误，年份应该大于 0");
        if (isLeapYear(year)) {
            System.out.println("年份"+year+"是闰年");
        } else {
            System.out.println("年份"+year+"不是闰年");
        }

    }

    public static boolean isLeapYear(int year) {
        return year%400==0 || (year%4==0 && year%100!=0);
    }
}
