package 泛型;

import java.util.ArrayList;

/**
 * @ClassName MyList
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/29 下午2:15
 * @Version 1.0
 **/
public class MyList<T> {
    /**
     * 这里放一个数组，用来存储信息
     * 但是，用下面这种方式，设置数组是不行的
     */
    // T []element;  用这种方式，是不行的
    /**
     * 泛型主要就是起一个限定作用，
     * 在 ArrayList 中，里面的数组是 Object 类型
     * 但是对传入的数据，做了类型限制
     * public boolean add(E e) {
     *         ensureCapacityInternal(size + 1);  // Increments modCount!!
     *         elementData[size++] = e;
     *         return true;
     *}
     * 比如说上面这个 add()方法，只能传入定义好的类型 E
     * 如果试图传入其他类型，就会报错
     */

    private Object[] element=new Object[10];

    public boolean add(T elem) {
        //在数组中添加元素...
        return true;
    }
}
