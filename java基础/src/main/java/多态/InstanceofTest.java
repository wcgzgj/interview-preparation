package 多态;

/**
 * @ClassName InstanceofTest
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/28 下午4:34
 * @Version 1.0
 **/
public class InstanceofTest {
    public static void main(String[] args) {

    }

    /**
     * 这个方法，我们要把 Person 转换为 Student
     * 但如果传入的是 Nurse，那就会报错
     * 这时候，我们就需要借助 instanceof，来判断传入的对象，是此类型的那种形态
     * @param p
     */
    public static void test(Person p) {
        if (p instanceof Student) {
            /**
             * 要从低一级向高一级强壮，我们必须保证传入的对象也是 Student
             * 不然，如果传入 Nurse，就会报错
             */
            Student stu = (Student) p;
        }
        //......
    }
}
