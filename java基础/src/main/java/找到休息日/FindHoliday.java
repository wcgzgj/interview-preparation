package 找到休息日;


import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @ClassName FindHoliday
 * @Description 找寻周日
 * @Author FARO_Z
 * @Date 2021/5/2 下午7:39
 * @Version 1.0
 **/

/**
 * 首次休息日是 2019 年 2 月 2 日
 */
public class FindHoliday {

    //实例化输入工具
    private static Scanner sc = new Scanner(System.in);

    private static int holidayCount=0;
    private static int holidayInWeekendCount=0;

    //设定起始时间
    private static final Calendar startDate = Calendar.getInstance();
    static {
        startDate.set(Calendar.YEAR,2019);
        //时刻注意，Calendar 的月的范围，是 0-11
        startDate.set(Calendar.MONTH,2-1);
        startDate.set(Calendar.DATE,2);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("请输入年:");
        int year = sc.nextInt();
        System.out.println("请输入月:");
        int month = sc.nextInt();
        if (year<2019) throw new Exception("错误，年份应从2019开始");
        if (year==2019 && month<2) throw new Exception("错误，应从2019年 2 月开始");
        if (month<1 || month>12) throw new Exception("错误，月份输入错误");

        // for (int i = 2019; i <= 2020; i++) {
        //     for (int j = 1; j <= 12; j++) {
        //         List<String> res = getResList(i, j);
        //         System.out.println(i+"年"+j+"月:"+res.toString());
        //     }
        // }

        //获取到的表身数据
        List<String> list = getResList(year, month);
        //打印表头
        printHead();
        //打印表身
        printBody(year,month,list);

        System.out.println();
        System.out.println("本月休息天数有:"+getHolidayCount());
        System.out.println("本月轮到周末休息天数为:"+getHolidayInWeekendCount());
    }

    /**
     * 获取日期表，为休息日打上中括号
     * @param year
     * @param month
     * @return
     */
    public static List<String> getResList(int year,int month) {
        List<String> res = new ArrayList<>();
        //因为 Calendar 的 month 范围是0-11，所以我要自己减去 1
        month--;
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR,year);
        cal.set(Calendar.MONTH,month);
        //获取当月总天数
        int days = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        for (int i = 1; i <= days; i++) {
            cal.set(Calendar.DATE,i);
            if (isHoliday(cal.getTime())) {
                //记录假期天数
                holidayCount++;
                res.add("["+i+"]");
                //如果是星期日或者星期六，记录下来
                if (cal.get(Calendar.DAY_OF_WEEK)==1 || cal.get(Calendar.DAY_OF_WEEK)==7) {
                    holidayInWeekendCount++;
                }
            } else {
                res.add(String.valueOf(i));
            }
        }
        return res;
    }

    /**
     * 判断当前日期下，是不是假期
     * @param date
     * @return
     */
    public static boolean isHoliday(Date date) {
        //获得当前日期，和假期起始日期间隔的天数
        int day = (int) ((date.getTime()-startDate.getTimeInMillis())/1000/60/60/24);
        return day%4==0;
    }

    /**
     * 获取当月的总假期天数
     * @return
     */
    public static int getHolidayCount() {
        return holidayCount;
    }

    /**
     * 获取假期和周末重合的天数
     * @return
     */
    public static int getHolidayInWeekendCount() {
        return holidayInWeekendCount;
    }

    /**
     * 打印日期的表头
     */
    public static void printHead() {
        List<String> list = new ArrayList<>();
        list.add("星期日");
        list.add("星期一");
        list.add("星期二");
        list.add("星期三");
        list.add("星期四");
        list.add("星期五");
        list.add("星期六");
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            sb.append(str+"\t");
        }
        System.out.println(sb.toString());
    }

    /**
     * 打印表身
     * @param year
     * @param month
     * @param list
     */
    public static void printBody(int year,int month,List<String> list) {
        //calendar 的月份，从0开始数
        month--;
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR,year);
        cal.set(Calendar.MONTH,month);
        cal.set(Calendar.DATE,1);
        /**
         * 获取当月 1 号是星期几
         * 其排列是
         *   1     2       3    。。  7
         * 星期日  星期一  星期二  。。 星期六
         *
         * Calendar 真的奇葩......
         */
        int day = cal.get(Calendar.DAY_OF_WEEK);
        /**
         * 获取本月的总天数
         */
        int dayNumInMonth = list.size();
        for (int i = 0; i < dayNumInMonth; i++) {
            StringBuilder sb = new StringBuilder();
            if (i==0) { // 第一天，打印的时候，要在前面加上相应长度的空格
                sb.append(getNumOfBlank(day-1))
                        .append(list.get(i))
                        .append(getNumOfBlank(1));
            } else {
                sb.append(list.get(i))
                        .append(getNumOfBlank(1));
            }
            System.out.print(sb.toString());
            cal.set(Calendar.DATE,i+1);
            //如果是星期 6，要打印换行
            if (cal.get(Calendar.DAY_OF_WEEK)==7) {
                System.out.println();
            }
        }

    }

    /**
     * 获取指定个数的空格
     * 空格的格式为"   \t"
     * 即三个" "加一个"\t"
     * 这个表头的每项距离是一样的
     * @param n
     * @return
     */
    public static String getNumOfBlank(int n) {
        if (n<=0) return "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("   \t");
        }
        return sb.toString();
    }
}
