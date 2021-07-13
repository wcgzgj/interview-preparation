package 基本数据类型;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName IntegerCache
 * @Description 高频区域数据缓冲
 * @Author FARO_Z
 * @Date 2021/3/10 下午6:20
 * @Version 1.0
 **/
public class IntegerCache {
    public static void main(String[] args) {
        Integer integer1 = 127;
        Integer integer2 = 127;
        //结果为true
        System.out.println(integer1==integer2);


        Integer integer3 = 128;
        Integer integer4 = 128;
        //结果为false
        System.out.println(integer3==integer4);

        integer1=126;
        System.out.println(integer2);

        Set<Short> set = new HashSet<>();
        for (short i = 0; i < 5; i++) {
            set.add(i);
            set.remove(i - 1);
        }
        System.out.println(set.size());

        float f=3.1f;
        double d=3.1d;


        String str = "test";
        System.out.println(str.substring(0,0));

        String str1 = "StringTest";
        String str2 = "String" + "Test";
        System.out.println(str1==str2);
    }
}
