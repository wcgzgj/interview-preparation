package 面向对象高级训练;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/28 下午6:05
 * @Version 1.0
 **/
public class UserService {
    /**
     * 假设这里有 Dao 层的接口 userMapper
     *
     * @Resource
     * private UserMapper userMapper;
     */

    /**
     * 这里，我就不自建 User对象了，我就写个 name 和 password
     * @param name
     * @param password
     * @return
     */
    public boolean login(String name,String password) {
        /**
         * 假装这里在 Dao 层中查询数据
         *
         * userMapper.selectByName(user.getName())
         * 。。。
         */
        if (name.equals("admin") && password.equals("123")) return true;
        return false;
    }
}
