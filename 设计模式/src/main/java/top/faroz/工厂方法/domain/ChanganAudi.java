package top.faroz.工厂方法.domain;

/**
 * @ClassName BeijingAudi
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/1 上午9:04
 * @Version 1.0
 **/
public class ChanganAudi extends Audi{
    public ChanganAudi() {
        this.name="长安 "+this.name;
        this.price=this.price*0.8;
    }

    @Override
    public void detail() {
        super.detail();
        System.out.println("这是长安奥迪，打了8折");
    }
}
