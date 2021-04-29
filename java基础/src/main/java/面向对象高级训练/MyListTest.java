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
        MyList list = new MyList();

        //添加0-4的 5 个元素
        for (int i = 0; i < 5; i++) {
            list.add(Integer.valueOf(i));
        }
        System.out.println(list.toString());
        System.out.println(list.size());

        //两次删除位置 1 的元素
        for (int i = 0; i < 2; i++) {
            list.remove(1);
        }
        System.out.println(list.toString());
        System.out.println(list.size());

        //打印获取的 1 号位的元素
        Object o = list.get(1);
        System.out.println(o);
    }
}
