package instanceof测试;

import 多态.Person;

import java.util.Objects;

/**
 * @ClassName MainClass
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/6 上午3:10
 * @Version 1.0
 **/
public class MainClass {
    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        System.out.println(testClass instanceof Interface1);
        System.out.println(testClass instanceof Interface2);
        System.out.println(testClass instanceof TestClass);
        System.out.println(testClass instanceof Object);
        System.out.println(testClass instanceof FatherClass);

    }
}
