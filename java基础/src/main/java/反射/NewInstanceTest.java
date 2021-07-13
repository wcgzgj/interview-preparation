package 反射;

import 反射.pojo.TestService;

/**
 * @ClassName NewInstanceTest
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/14 上午11:09
 * @Version 1.0
 **/
public class NewInstanceTest {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Class<TestService> c = TestService.class;
        TestService testService = c.newInstance();
        System.out.println(testService.getTestDao().getDaoImpl());
    }
}
