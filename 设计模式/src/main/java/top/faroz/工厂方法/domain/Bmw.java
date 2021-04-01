package top.faroz.工厂方法.domain;

/**
 * @ClassName Bmw
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/1 上午8:11
 * @Version 1.0
 **/
public class Bmw extends Car{
    public Bmw() {
        this.name="宝马";
        this.price=253d;
    }

    @Override
    public void detail() {
        System.out.println("this is a bmw car");
        System.out.println(name+"  "+price);
    }
}
