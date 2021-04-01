package top.faroz.工厂方法.domain;

/**
 * @ClassName BeijingBenz
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/1 上午9:06
 * @Version 1.0
 **/
public class BeijingBenz extends Benz{
    public BeijingBenz() {
        this.name="北京 "+this.name;
        this.price=this.price*0.6;
    }

    @Override
    public void detail() {
        super.detail();
        System.out.println("这是北京奔驰，打了6折");
    }
}
