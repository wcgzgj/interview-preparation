package top.faroz.工厂方法;

import top.faroz.工厂方法.store.BeijingCarStore;
import top.faroz.工厂方法.store.ChanganCarStore;

/**
 * @ClassName Main
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/1 上午8:35
 * @Version 1.0
 **/
public class Main {
    public static void main(String[] args) {
        BeijingCarStore beijingCarStore = new BeijingCarStore();
        ChanganCarStore changanCarStore = new ChanganCarStore();

        Car beijingAudi = beijingCarStore.orderCar("HighClassAudi");
        Car changanAudi = changanCarStore.orderCar("Audi");



    }
}
