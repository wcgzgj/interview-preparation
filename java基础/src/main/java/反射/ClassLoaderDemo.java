package 反射;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @ClassName ClassLoaderDemo
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/6 上午11:21
 * @Version 1.0
 **/
public class ClassLoaderDemo {
    public static void main(String[] args) throws IOException {
        /**
         * 通过类加载器，获取配置文件的输入流
         * 默认访问路径，是 resources 文件夹
         */
        InputStream is = ClassLoaderDemo.class.getClassLoader().getResourceAsStream("config.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        System.out.println(br.readLine());
    }
}
