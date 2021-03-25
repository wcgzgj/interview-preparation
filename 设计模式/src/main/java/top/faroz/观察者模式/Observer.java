package top.faroz.观察者模式;

public interface Observer {
    /**
     * 观察者更新
     * 当Subject去Notify所有观察者的时候，就是去调用观察者的update方法
     * private String info;
     * private float price;
     * private int nums;
     */
    public void update(String info, Float price, Integer nums);
}
