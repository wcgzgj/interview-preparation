package top.faroz.工厂方法.absfac;

import top.faroz.工厂方法.CarParts.Paint;
import top.faroz.工厂方法.CarParts.Seat;
import top.faroz.工厂方法.CarParts.Wheel;

public interface CarPartFactory {
    Paint createPaint();
    Seat createSeat();
    Wheel createWheel();
}
