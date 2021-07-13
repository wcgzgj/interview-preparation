package top.faroz.迭代器模式;

import java.util.Iterator;

/**
 * 菜单接口，所有菜单，都要实现一个 createIterator 的方法
 */
public interface Menu {
    Iterator createIterator();
}
