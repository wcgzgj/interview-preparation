package top.faroz.工厂方法.simplefac;

import top.faroz.工厂方法.domain.Audi;
import top.faroz.工厂方法.domain.Benz;
import top.faroz.工厂方法.domain.Bmw;
import top.faroz.工厂方法.domain.BaseCar;

/**
 * @ClassName SimpleFac
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/1 上午8:10
 * @Version 1.0
 **/
public class SimpleCarFactory {
    public static BaseCar createCar(String type) {
        switch (type) {
            case "Audi":
                return new Audi();
            case "Bmw":
                return new Bmw();
            case "Benz":
                return new Benz();
            default:
                return null;
        }
    }
}
