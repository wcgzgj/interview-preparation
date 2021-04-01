package top.faroz.工厂方法.domain;

import top.faroz.工厂方法.CarParts.Paint;
import top.faroz.工厂方法.CarParts.Seat;
import top.faroz.工厂方法.CarParts.Wheel;

/**
 * @ClassName Car
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/1 上午8:11
 * @Version 1.0
 **/
public abstract class BaseCar {
    String name;
    double price;
    Seat seat;
    Paint paint;
    Wheel wheel;


    public abstract void detail();

    public void installWheel() {
        System.out.println(name+"正在安装车轮");
    }

    public void installSeat() {
        System.out.println(name+"正在安装座椅");
    }

    public void paint() {
        System.out.println(name+"正在喷漆");
    }
}
