package 泛型;

/**
 * @ClassName MyList1
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/29 下午2:33
 * @Version 1.0
 **/
public class MyList1<T> implements ListInterface<T> {

    @Override
    public boolean add(T elem) {
        return false;
    }

    @Override
    public T get(int index) {
        return null;
    }
}
