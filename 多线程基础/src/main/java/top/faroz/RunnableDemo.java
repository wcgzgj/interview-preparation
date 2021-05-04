package top.faroz;

/**
 * @ClassName ThreadDemo
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/4 下午9:31
 * @Version 1.0
 **/
public class RunnableDemo {
    public static void main(String[] args) {

        //子线程
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("汗滴禾下土"+i);
            }
        }, "子线程").start();

        //主线程（的一部分，整个 main 都是主线程）
        for (int i = 0; i < 10; i++) {
            System.out.println("锄禾日当午"+i);
        }
    }
}
