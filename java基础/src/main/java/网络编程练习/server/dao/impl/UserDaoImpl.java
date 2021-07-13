package 网络编程练习.server.dao.impl;

import 网络编程练习.server.dao.UserDao;
import 网络编程练习.server.pojo.User;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName UserDaoImpl
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/5 下午10:37
 * @Version 1.0
 **/
public class UserDaoImpl implements UserDao {

    /**
     * 模拟用户数据表
     * 存放管理员和用户的信息
     */
    private static Map<String, HashSet<User>> userTable = new HashMap<>();

    /**
     * 假定:管理员用户名:admin,密码:abc 普通用户名:user 密码:123
     */
    static {
        HashSet<User> users = new HashSet<>();
        HashSet<User> admins = new HashSet<>();
        users.add(new User("user","123"));
        admins.add(new User("admin","abc"));

        userTable.put("user",users);
        userTable.put("admin",admins);
    }

    @Override
    public User selectByName(String name,String type) {
        User res = null;
        if ("user".equals(type)) {
            Set<User> users = userTable.get("user");
            for (User user : users) {
                if (user.getName().equals(name)) {
                    res = new User(user.getName(),user.getPassword());
                }
            }
        } else if ("admin".equals(type)) {
            Set<User> users = userTable.get("admin");
            for (User user : users) {
                if (user.getName().equals(name)) {
                    res = new User(user.getName(),user.getPassword());
                }
            }
        }
        return res;
    }

}
