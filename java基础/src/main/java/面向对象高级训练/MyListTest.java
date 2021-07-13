package 面向对象高级训练;

/**
 * @ClassName MyListTest
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/28 下午6:17
 * @Version 1.0
 **/
public class MyListTest {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();

        list.add("aaa");
        list.add("hahaha");
        list.add("hiuwqnd");
        System.out.println(list.toString());
    }
}
