package 网络编程练习.server.req;

import java.io.Serializable;

/**
 * @ClassName LoginReq
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/5 下午10:41
 * @Version 1.0
 **/
public class LoginReq implements Serializable {
    private String name;
    private String password;
    private String identity;

    public LoginReq(String name, String password, String identity) {
        this.name = name;
        this.password = password;
        this.identity = identity;
    }

    public LoginReq() {
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

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    @Override
    public String toString() {
        return "LoginReq{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", identity='" + identity + '\'' +
                '}';
    }
}
