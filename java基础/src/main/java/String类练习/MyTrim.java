package String类练习;

/**
 * @ClassName MyTrim
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/2 下午7:33
 * @Version 1.0
 **/
public class MyTrim {
    public static void main(String[] args) {
        String str1 = "   My name is FARO_Z   ";
        String str2 = "  I love coding";
        System.out.println(myTrim(str1));
        System.out.println(myTrim(str2));
    }

    /**
     * 实现自己的 trim 函数
     * @param str
     * @return
     */
    public static String myTrim(String str) {
        if (str.length()==0) return str;
        char[] arr = str.toCharArray();
        int iMax = arr.length - 1;
        int start = 0;
        int end = arr.length - 1;
        while (start<=iMax && arr[start]==' ') start++;
        while (end>=0 && arr[end]==' ') end--;
        return str.substring(start,end+1);
    }
}
