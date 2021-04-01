package top.faroz.工厂方法.store;

import top.faroz.工厂方法.domain.ChanganAudi;
import top.faroz.工厂方法.domain.ChanganBenz;
import top.faroz.工厂方法.domain.ChanganBmw;
import top.faroz.工厂方法.domain.Car;

/**
 * @ClassName ChanganCarStore
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/1 上午9:10
 * @Version 1.0
 **/
public class ChanganCarStore extends CarStore{

    @Override
    Car createCar(String type) {
        switch (type) {
            case "Audi":
                return new ChanganAudi();
            case "Bmw":
                return new ChanganBmw();
            case "Benz":
                return new ChanganBenz();
            default:
                return null;
        }
    }
}
