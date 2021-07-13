package top.faroz.迭代器模式;

import java.util.Iterator;

/**
 * @ClassName IteratorTest
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/26 下午8:35
 * @Version 1.0
 **/
public class IteratorTest {
    public static void main(String[] args) {
        CafeMenu cafeMenu = new CafeMenu();
        Iterator iterator = cafeMenu.createIterator();
        while (iterator.hasNext()) {
            System.out.println((String)iterator.next());
        }
    }
}
