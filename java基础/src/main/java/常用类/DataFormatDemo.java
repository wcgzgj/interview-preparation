package 常用类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @ClassName DataFormatDemo
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/2 下午3:07
 * @Version 1.0
 **/
public class DataFormatDemo {
    public static void main(String[] args) throws ParseException {
        // SimpleDateFormat sdf = new SimpleDateFormat("yyyy 年 MM 月 dd 日 HH 时 mm 分 ss 秒");
        // SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd   HH:mm:ss");
        // String text = sdf.format(new Date());
        // System.out.println(text);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse("2021-5-2 15:25:00");
        System.out.println(date.getTime());
        // System.out.println((date.getTime()-new Date().getTime())/(1000*60));
    }
}
