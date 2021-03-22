package 泛型;

/**
 * @ClassName GenericTest
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/3/22 上午10:37
 * @Version 1.0
 **/
public class GenericTest<T> {
    public T  getNum(T x,T y) {
        return x;
    }

    public T getInstance(Class<T> tClasss) {
        T t=null;
        try {
            t = tClasss.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return t;
    }
}
