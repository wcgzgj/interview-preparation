package top.faroz.迭代器模式;

import java.util.Iterator;

/**
 * @ClassName CafeMenu
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/26 下午8:29
 * @Version 1.0
 **/
public class CafeMenu implements Menu{

    private String[] menu=new String[]{"蒸羊羔","蒸熊掌","烤全鸭","考全鹅"};


    @Override
    public Iterator createIterator() {
        return new CafeMenuIterator(menu);
    }

}
