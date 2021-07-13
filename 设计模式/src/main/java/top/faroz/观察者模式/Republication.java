package top.faroz.观察者模式;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Republication
 * @Description 出版社，其相当于主题Subject
 * @Author FARO_Z
 * @Date 2021/3/25 上午10:43
 * @Version 1.0
 **/
public class Republication implements Subject{

    private String info;
    private float price;
    private int nums;
    private List<Observer> observers=new ArrayList<Observer>();

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int index = observers.indexOf(o);
        observers.remove(index);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(info,price,nums);
        }
    }

    public void measureChanged() {
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
}
