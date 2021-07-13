package top.faroz.模板方法模式;

/**
 * @ClassName Tea
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/1 下午11:43
 * @Version 1.0
 **/
public class Tea extends Drink{
    @Override
    void addMeta() {
        System.out.println("正在加入茶叶");
    }

    @Override
    void addExtra() {
        System.out.println("正在加入红茶佐料");
    }
}
