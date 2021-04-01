package top.faroz.工厂方法.domain;

/**
 * @ClassName BeijingBenz
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/1 上午9:06
 * @Version 1.0
 **/
public class BeijingBmw extends Bmw{
    public BeijingBmw() {
        this.name="北京 "+this.name;
        this.price=this.price*0.7;
    }

    @Override
    public void detail() {
        super.detail();
        System.out.println("这是北京宝马，打了7折");
    }
}
