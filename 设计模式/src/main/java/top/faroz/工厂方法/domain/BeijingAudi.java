package top.faroz.工厂方法.domain;


import top.faroz.工厂方法.absfac.CarPartFactory;

/**
 * @ClassName BeijingAudi
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/1 上午9:04
 * @Version 1.0
 **/
public class BeijingAudi extends Audi{

    CarPartFactory partFactory;

    public BeijingAudi() {
        this.name="北京 "+this.name;
        this.price=this.price*0.8;
    }

    /**
     * 从外部，实例化 抽象工厂CarPartFactory
     * @param partFactory
     */
    public BeijingAudi(CarPartFactory partFactory) {
        this.partFactory = partFactory;
        this.name="北京 "+this.name;
        this.price=this.price*0.8;
    }

    public void prepare() {
        this.seat=partFactory.createSeat();
        this.paint=partFactory.createPaint();
        this.wheel=partFactory.createWheel();
    }

    @Override
    public void detail() {
        prepare();
        super.detail();
        System.out.println("这是北京奥迪，打了8折");
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "BeijingAudi{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", seat=" + seat +
                ", paint=" + paint +
                ", wheel=" + wheel +
                "} " + super.toString();
    }
}
