package 泛型;

/**
 * @ClassName MyList2
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/29 下午2:35
 * @Version 1.0
 **/
public class MyList2 implements ListInterface<String>{

    @Override
    public boolean add(String elem) {
        return false;
    }

    @Override
    public String get(int index) {
        return null;
    }
}
