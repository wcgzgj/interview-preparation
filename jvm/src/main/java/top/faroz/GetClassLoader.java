package top.faroz;

/**
 * @ClassName GetClassLoader
 * @Description TODO
 * @Author faro_z
 * @Date 2021/8/2 2:17 下午
 * @Version 1.0
 **/
public class GetClassLoader {
    public static void main(String[] args) {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        System.out.println(loader);
        System.out.println(loader.getParent());
        System.out.println(loader.getParent().getParent());
    }
}
