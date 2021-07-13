package top.faroz.观察者模式;

/**
 * @ClassName Customer
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/3/25 上午10:48
 * @Version 1.0
 **/
public class Customer implements Observer{
    private String info;
    private float price;
    private int nums;

    /**
     * 不需要无参构造，
     * 因为其信息的更新，仰赖与Subject的信息更新
     */


    @Override
    public void update(String info, Float price, Integer nums) {
        if (info!=null) {
            this.info=info;
        }
        if (price!=null) {
            this.price=price;
        }
        if (nums!=null) {
            this.nums=nums;
        }
    }

    /**
     * 观察者自带的方法
     * 显示更新后的信息
     */
    public void display() {
        System.out.println(this.toString()+"\n\n");
    }

    @Override
    public String toString() {
        return "Customer{" +
                "info='" + info + '\'' +
                ", price=" + price +
                ", nums=" + nums +
                '}';
    }
}
