package top.faroz.class_loader;

/**
 * @ClassName MyClassLoader
 * @Description TODO
 * @Author faro_z
 * @Date 2021/8/4 7:53 下午
 * @Version 1.0
 **/
public class MyClassLoader extends ClassLoader {
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        return null;
    }


}
