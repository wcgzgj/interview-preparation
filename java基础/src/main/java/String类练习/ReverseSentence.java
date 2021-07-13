package String类练习;

import java.util.Arrays;

/**
 * @ClassName ReverseSentence
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/2 下午5:44
 * @Version 1.0
 **/
public class ReverseSentence {
    public static void main(String[] args) {
        String str = "I like writing code best";
        String reverse = getReverse(str);
        System.out.println(reverse);
    }

    /**
     * 依照要求，倒置
     * 先将所以元素倒置，然后，依据空格，倒置单词
     * @param str
     * @return
     */
    public static String getReverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb=sb.reverse();
        //根据空格，分成字符串数组
        String[] strArr = sb.toString().split(" ");
        reverseArr(strArr);

        StringBuilder res = new StringBuilder();
        int iMax = strArr.length-1;
        for (int i = 0; ; i++) {
            if(i==iMax) {
                res.append(strArr[i]);
                return res.toString();
            }
            else res.append(strArr[i]).append(" ");
        }
    }

    /**
     * 倒置数组元素
     * @param arr
     * @param <T>
     * @return
     */
    public static <T> void reverseArr(T[] arr) {
        if (arr.length==0) return;
        int i=0,j=arr.length-1;
        while (i<j) {
            T tmp = arr[i];
            arr[i]=arr[j];
            arr[j]=tmp;
            i++;
            j--;
        }
    }


}
