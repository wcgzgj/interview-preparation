package 基本数据类型;

/**
 * @ClassName ChangeWithoutThirdParty
 * @Description 不依靠第三个变量，交换数字
 * @Author FARO_Z
 * @Date 2021/4/27 下午10:31
 * @Version 1.0
 **/
public class ChangeWithoutThirdParty {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        a=a+b;
        b=a-b; //b==origin a
        a=a-b; //a==origin b
        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
}
