package top.faroz.工厂方法.store;

import top.faroz.工厂方法.domain.Car;
import top.faroz.工厂方法.absfac.SuperHighClassCarPartFactory;
import top.faroz.工厂方法.domain.*;

/**
 * @ClassName BeijingCarStore
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/1 上午9:10
 * @Version 1.0
 **/
public class BeijingCarStore extends CarStore{

    @Override
    Car createCar(String type) {
        switch (type) {
            case "Audi":
                return new BeijingAudi();
            case "Bmw":
                return new BeijingBmw();
            case "Benz":
                return new BeijingBenz();
            case "HighClassAudi": //如果想创建超高级的奥迪
                return new BeijingAudi(new SuperHighClassCarPartFactory());
            default:
                return null;
        }
    }

}
