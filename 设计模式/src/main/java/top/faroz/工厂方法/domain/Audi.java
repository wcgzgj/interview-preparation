package top.faroz.工厂方法.domain;

/**
 * @ClassName Audi
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/1 上午8:11
 * @Version 1.0
 **/
public class Audi extends Car {


    public Audi() {
        this.name="奥迪";
        this.price=200d;
    }



    @Override
    public void detail() {
        System.out.println("this is a audi");
        System.out.println(name+"  "+price);
    }
}
