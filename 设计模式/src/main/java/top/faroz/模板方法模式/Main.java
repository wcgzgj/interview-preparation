package top.faroz.模板方法模式;

import com.sun.media.sound.SoftFilter;
import sun.java2d.pipe.SpanIterator;

/**
 * @ClassName Main
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/1 下午11:44
 * @Version 1.0
 **/
public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        Tea tea = new Tea();

        coffee.prepare();
        System.out.println("\n\n");
        tea.prepare();
    }
}
