package top.faroz.工厂方法;

import top.faroz.工厂方法.absfac.SuperHighClassCarPartFactory;
import top.faroz.工厂方法.domain.BaseCar;
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
        // ChanganCarStore changanCarStore = new ChanganCarStore();

        BaseCar highClassAudi = beijingCarStore.orderBaseCar("HighClassAudi");
        // BaseCar audi = changanCarStore.orderBaseCar("Audi");

        highClassAudi.detail();


    }
}
