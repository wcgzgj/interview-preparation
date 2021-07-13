package 集合;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @ClassName IteratorDemo
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/3 下午3:02
 * @Version 1.0
 **/
public class IteratorDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        ListIterator<Integer> iterator = list.listIterator();
        System.out.println(iterator.next());
    }
}
