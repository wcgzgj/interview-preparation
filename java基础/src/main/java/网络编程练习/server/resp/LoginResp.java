package 网络编程练习.server.resp;

import java.io.Serializable;

/**
 * @ClassName LoginResp
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/5 下午11:08
 * @Version 1.0
 **/
public class LoginResp implements Serializable {
    private String name;
    private String indentity;
    private String message;

    public LoginResp(String name, String indentity, String message) {
        this.name = name;
        this.indentity = indentity;
        this.message = message;
    }

    public LoginResp() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIndentity() {
        return indentity;
    }

    public void setIndentity(String indentity) {
        this.indentity = indentity;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "LoginResp{" +
                "name='" + name + '\'' +
                ", indentity='" + indentity + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
