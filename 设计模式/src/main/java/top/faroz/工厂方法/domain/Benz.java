package top.faroz.工厂方法.domain;

/**
 * @ClassName Benz
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/1 上午8:11
 * @Version 1.0
 **/
public class Benz extends Car {
    public Benz() {
        this.name="奔驰";
        this.price=300d;
    }

    @Override
    public void detail() {
        System.out.println("this is benz");
        System.out.println(name+"  "+price);
    }

}
