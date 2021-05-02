package 常用类;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @ClassName CalanderDemo
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/2 下午3:40
 * @Version 1.0
 **/
public class CalenderDemo {
    public static void main(String[] args) {
        //Calendar cal = Calendar.getInstance();
        // cal.set(Calendar.YEAR,1); //将年份设置为 1
        // int year = cal.get(Calendar.YEAR);
        // int month = cal.get(Calendar.MONTH);
        // System.out.println(year);
        // System.out.println(month);

        // System.out.println("当前年份："+cal.get(Calendar.YEAR));
        // cal.add(Calendar.YEAR,1);
        // System.out.println("年份+1后："+cal.get(Calendar.YEAR));

        // Calendar cal = Calendar.getInstance();
        // Date date = cal.getTime();
        // System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(date));

        // Calendar cal = Calendar.getInstance();
        // System.out.println(cal.getActualMaximum(Calendar.MONTH));

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH,11);
        System.out.println("将当前月份设置为 11（实际为 12 月）:"+cal.get(Calendar.MONTH));
        cal.add(Calendar.MONTH,1);
        System.out.println("为月份+1后："+cal.get(Calendar.MONTH));
    }
}
