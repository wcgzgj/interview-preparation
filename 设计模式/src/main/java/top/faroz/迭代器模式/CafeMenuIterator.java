package top.faroz.迭代器模式;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 * @ClassName CafeMenuIterator
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/26 下午8:29
 * @Version 1.0
 **/

/**
 * CafeMenu的迭代器，实现 Iterator 接口
 */
public class CafeMenuIterator implements Iterator {

    //传入迭代器的遍历对象
    private String[] items;
    //记录位置
    int position=-1;

    public CafeMenuIterator(String[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position<items.length-1 && (items[position+1]!=null);
    }

    @Override
    public Object next() {
        return items[++position];
    }

    @Override
    public void remove() {

    }
}
