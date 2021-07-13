import org.junit.Test;

/**
 * @ClassName MyTest
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/3/25 上午10:35
 * @Version 1.0
 **/
public class MyTest {
    public static void foo(int ...ints) {
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    @Test
    public void intsTest() {
        foo(1,2,3,4,5,3,2,1);
    }
}
