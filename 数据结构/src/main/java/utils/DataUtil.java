package utils;

import java.util.Random;

/**
 * @ClassName DataUtil
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/3/10 下午1:16
 * @Version 1.0
 **/
public class DataUtil {

    /**
     * 获取指定长度，随机元素的数组
     * @param n
     * @param max
     * @return
     */
    public static int[] getRandomData(int n,int max) {
        int[] arr = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            arr[i]=r.nextInt(max);
        }
        return arr;
    }
}
