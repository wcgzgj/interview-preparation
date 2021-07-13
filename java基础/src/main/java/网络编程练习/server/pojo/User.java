package 网络编程练习.server.pojo;

import java.io.Serializable;

/**
 * @ClassName User
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/5 下午10:36
 * @Version 1.0
 **/
public class User implements Serializable {
    private String name;
    private String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public User() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
