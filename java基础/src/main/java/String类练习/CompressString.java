package String类练习;

/**
 * @ClassName CompressString
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/2 下午7:08
 * @Version 1.0
 **/
public class CompressString {
    public static void main(String[] args) {
        String str1 = "aabcccccddddd";
        String str2 = "abcdd";

        System.out.println("aabcccccddddd化简后为:"+compressString(str1));
        System.out.println("abcdd化简后为:"+compressString(str2));
    }

    /**
     * 先无条件获取化简后的字符串
     * 在根据长度去取舍
     * @param str
     * @return
     */
    public static String compressString(String str) {
        if (str.length()==0) return str;
        String res = compress(str);
        if (res.length()>str.length()) return str;
        return res;
    }

    /**
     * 无条件化简传来的字符串
     * @param str
     * @return
     */
    private static String compress(String str) {
        //存储最后的
        StringBuilder res = new StringBuilder();
        char[] arr = str.toCharArray();
        int iMax = arr.length - 1;
        int start=0,end=start;
        while (start<=iMax) {
            int count=0;
            while (end<=iMax && arr[end]==arr[start]) {
                count++;
                end++;
            }
            res.append(arr[start])
                    .append(count);
            start=end;
        }
        return res.toString();
    }
}
