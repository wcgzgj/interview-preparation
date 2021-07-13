package 基本数据类型;

/**
 * @ClassName CheckPalindrome
 * @Description 判断是不是回文数
 * @Author FARO_Z
 * @Date 2021/4/27 下午10:22
 * @Version 1.0
 **/
public class CheckPalindrome {
    public static void main(String[] args) {
        int[] testData=new int[]{121,34543,1232,1111,2};
        for (int i = 0; i < testData.length; i++) {
            System.out.println(isPalindrome(testData[i]));
        }
        //true true false true true
    }

    public static boolean isPalindrome(int num) {
        String strNum=String.valueOf(num);
        if (strNum.length()==1) return true;
        int i=0,j=strNum.length()-1;
        while (i<=j) {
            if (strNum.charAt(i)!=strNum.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
