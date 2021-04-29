package 面向对象高级训练;

/**
 * @ClassName UserServiceTest
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/28 下午6:15
 * @Version 1.0
 **/
public class UserServiceTest {
    public static void main(String[] args) {
        UserService userService = new UserService();
        System.out.println(userService.login("admin","123"));
        System.out.println(userService.login("admin","1234"));
        System.out.println(userService.login("jojo","123"));
    }
}
