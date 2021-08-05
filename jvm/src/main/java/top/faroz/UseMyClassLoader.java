package top.faroz;

import lombok.SneakyThrows;
import top.faroz.class_loader.MyClassLoader;

/**
 * @ClassName UseMyClassLoader
 * @Description TODO
 * @Author faro_z
 * @Date 2021/8/4 8:10 下午
 * @Version 1.0
 **/
public class UseMyClassLoader {

    @SneakyThrows
    public static void main(String[] args) {
        MyClassLoader myClassLoader = new MyClassLoader();

        Class<?> aClass = myClassLoader.loadClass("<full class name>");
        // ...



    }
}
