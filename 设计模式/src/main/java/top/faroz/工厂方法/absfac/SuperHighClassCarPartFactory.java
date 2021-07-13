package top.faroz.工厂方法.absfac;

import top.faroz.工厂方法.CarParts.*;

/**
 * @ClassName SuperHighClassCarPartFactory
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/1 上午10:45
 * @Version 1.0
 **/
public class SuperHighClassCarPartFactory implements CarPartFactory{
    @Override
    public Paint createPaint() {
        return new FuckingExpensivePaint();
    }

    @Override
    public Seat createSeat() {
        return new FuckingExpensiveSeat();
    }

    @Override
    public Wheel createWheel() {
        return new FuckingExpensiveWheel();
    }
}
