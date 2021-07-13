package 流程控制;

import java.util.Scanner;

/**
 * @ClassName GetDayOfYearOfMonth
 * @Description 获取某年某月天数
 * @Author FARO_Z
 * @Date 2021/4/27 下午11:19
 * @Version 1.0
 **/
public class GetDayOfYearOfMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        System.out.println(year+"-"+month+"有"+getDay(year,month)+"天");
    }

    public static int getDay(int year,int month) {
        int[] days = {-1, 31, 28 + isLeapYear(year), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return days[month];
    }

    public static int isLeapYear(int year) {
        if (year%400==0 || (year%4==0 && year%100!=0)) {
            return 1;
        }
        return 0;
    }

}
