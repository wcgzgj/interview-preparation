package top.faroz;

/**
 * @ClassName ProducerAndCustomer
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/5 下午2:49
 * @Version 1.0
 **/
public class ProducerAndCustomer {
    public static void main(String[] args) {
        Food food = new Food();
        new Thread(new Cook(food)).start();
        new Thread(new Waiter(food)).start();
    }
}


class Waiter implements Runnable {

    private Food food;

    public Waiter(Food food) {
        this.food = food;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            synchronized (food) {
                if (!food.isEmpty) {
                    food.get();

                    food.isEmpty=true;
                    food.notifyAll();
                    try {
                        food.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}


class Cook implements Runnable{

    private Food food;

    public Cook(Food food) {
        this.food = food;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            /**
             * 这里因为要访问临界资源 isEmpty，所以必须加锁
             */
            synchronized (food) {
                if (food.isEmpty) {
                    if (i%2==0) {
                        food.setName("煎饼果子");
                        food.setTest("咸味");
                    } else {
                        food.setName("豆腐脑");
                        food.setTest("超甜味");
                    }

                    System.out.println("厨师把菜做好了,菜品为:"+food.toString());
                    //厨师做好了菜，将盘子设置为不空
                    food.isEmpty=false;
                    //唤醒其他线程
                    food.notifyAll();
                    //当前线程休眠
                    try {
                        food.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}


class Food {
    private String name;
    private String test;
    public boolean isEmpty=true;

    public Food(String name, String test) {
        this.name = name;
        this.test = test;
    }

    public Food() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public void get() {
        System.out.println("服务员端走了菜:"+this.toString());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("名称:").append(this.name).append("\n")
                .append("味道:").append(this.test).append("\n");
        return sb.toString();
    }
}
