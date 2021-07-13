package top.faroz.观察者模式;

import java.util.Observable;
import java.util.Observer;

/**
 * @ClassName Republication2
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/3/25 下午1:35
 * @Version 1.0
 **/
public class Republication2 extends Observable {

    private String info;
    private float price;
    private int nums;

    public void measureChanged() {
        /**
         * 一定要调用setChanged方法
         * 因为Observable方法中设定了标志位
         * 只有通过setChanged()方法，将标志位设置为true
         * 才会去选择更新观察者的信息
         */
        setChanged();
        notifyObservers();
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setNums(int nums) {
        this.nums = nums;
    }

    public String getInfo() {
        return info;
    }

    public float getPrice() {
        return price;
    }

    public int getNums() {
        return nums;
    }
}
