package 反射.pojo;

/**
 * @ClassName TestService
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/14 上午11:08
 * @Version 1.0
 **/
public class TestService {
    private TestDao testDao = new TestDao();

    public TestDao getTestDao() {
        return testDao;
    }
}
