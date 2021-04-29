package 面向对象高级训练;

import javax.swing.*;
import java.util.Arrays;

/**
 * @ClassName MyList
 * @Description 自定义 list
 * @Author FARO_Z
 * @Date 2021/4/28 下午6:06
 * @Version 1.0
 **/
public class MyList {
    private Object[] element=new Object[10];
    //数组长度
    private int len=10;
    //数组元素个数
    private int size=0;

    public boolean add(Object obj) {
        if (size>=len) {
            //如果超范围，则扩容两倍
            this.len=len*2;
            element=copyArray(element,len);
        }
        this.element[size]=obj;
        size++;
        return true;
    }

    /**
     * 新建一个指定大小的数组，并将元素赋到新的数组中
     * @param source
     * @param newSize
     * @return
     */
    private Object[] copyArray(Object[] source,int newSize) {
        //新的数组，长度必须比原来的数组长度长
        if (newSize<source.length) return null;
        Object[] newArr = new Object[newSize];
        for (int i = 0; i < source.length; i++) {
            newArr[i]=source[i];
        }
        return newArr;
    }

    /**
     * 题目中要求不返回
     * 但是一般 remove 都是要返回被删除的数据的
     * 所以，我就加上返回被删除元素的功能
     * @param index
     * @return
     */
    public Object remove(int index) {
        //如果删除的位置，超过存在元素的位置，就返回 null
        if (index>=size) return null;
        Object tmp = this.element[index];
        element[index]=null;
        for (int i = index; i < size - 1; i++) {
            this.element[i]=this.element[i+1];
        }
        size--;
        return tmp;
    }

    public Object get(int index) {
        if (index>=size) return null;
        return element[index];
    }

    public int size() {
        return size;
    }

    /**
     * 覆写 toString 方法
     * @return
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size-1; i++) {
            sb.append(element[i]+",");
        }
        sb.append(element[size-1]+"]");
        return sb.toString();
    }
}
