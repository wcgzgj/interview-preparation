package top.faroz;

/**
 * @ClassName ThreadDemo2
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/5 上午12:35
 * @Version 1.0
 **/
public class ThreadDemo2 {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName()+":"+i);
                    //这里的 InterruptedException ,就是检查有没有被中断的
                } catch (InterruptedException e) {
                    //e.printStackTrace();
                    System.out.println("检测到打扰标记，线程死亡！");

                    /**
                     * 在死亡前，可以在这里进行资源释放
                     * 类似于交代后事
                     */
                    System.out.println("爷要 si 了，资源都释放掉了！");


                    //如果要线程死亡，我们只要让 run 方法 return 就好了
                    return;
                }
            }
        }, "子线程");

        t1.start();

        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()+":"+i);
        }

        /**
         * 给线程 t1 添加中断标记
         */
        t1.interrupt();
    }
}
