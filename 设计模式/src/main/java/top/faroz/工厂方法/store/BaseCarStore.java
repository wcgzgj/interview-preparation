package top.faroz.工厂方法.store;

import top.faroz.工厂方法.domain.BaseCar;

/**
 * @ClassName BaseCarStore
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/1 下午5:24
 * @Version 1.0
 **/
public abstract class BaseCarStore {
    public BaseCar orderBaseCar(String type) {
        BaseCar car=null;

        /**
         * 使用工厂方法后，就没有具体的工厂实现了
         */
        // car= SimpleBaseCarFactory.createBaseCar(type);

        /**
         * 只关心使用，不关心实现
         * 这就是解耦
         */
        car=createBaseCar(type);

        car.installSeat();
        car.installWheel();
        car.paint();

        return car;
    }

    /**
     * 抽象的创建方法
     * 交给子类去实现
     * @param type
     * @return
     */
    abstract BaseCar createBaseCar(String type);
}
