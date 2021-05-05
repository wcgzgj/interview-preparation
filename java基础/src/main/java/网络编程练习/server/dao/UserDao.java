package 网络编程练习.server.dao;

import 网络编程练习.server.pojo.User;

/**
 * @ClassName UserDao
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/5 下午10:37
 * @Version 1.0
 **/
public interface UserDao {
    User selectByName(String name,String type);
}
