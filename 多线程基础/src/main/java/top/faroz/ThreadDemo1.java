package top.faroz;

/**
 * @ClassName ThreadDemo1
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/5 上午12:24
 * @Version 1.0
 **/
public class ThreadDemo1 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            System.out.println("hahaha");
        }
    }
}
