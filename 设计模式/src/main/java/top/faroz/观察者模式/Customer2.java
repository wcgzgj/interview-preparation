package top.faroz.观察者模式;

import java.util.Observable;
import java.util.Observer;

/**
 * @ClassName Customer2
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/3/25 下午1:33
 * @Version 1.0
 **/
public class Customer2 implements Observer {

    private String info;
    private float price;
    private int nums;


    /**
     * Subject在更新Observer的时候
     * 会传入自身
     * 从而方便Observer根据Subject来更新自己的数据
     * @param o Subject传入的自身
     * @param arg 参数，如果没有的话，subject会传入null
     */
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Republication2) {
            Republication2 rep = (Republication2) o;
            this.info=rep.getInfo();
            this.price=rep.getPrice();
            this.nums=rep.getNums();
        }
    }

    public void display() {
        System.out.println(this.toString()+"\n");
    }

    @Override
    public String toString() {
        return "Customer2{" +
                "info='" + info + '\'' +
                ", price=" + price +
                ", nums=" + nums +
                '}';
    }
}