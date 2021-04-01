package top.faroz.装饰者模式;

/**
 * @ClassName Drink
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/3/27 下午2:00
 * @Version 1.0
 **/
public abstract class Drink {
    private String detail="不知名饮料";
    public abstract String getDetail();
    public abstract double price();

}
