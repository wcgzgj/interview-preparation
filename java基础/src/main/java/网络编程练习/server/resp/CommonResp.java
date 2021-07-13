package 网络编程练习.server.resp;

import javax.swing.text.StyledEditorKit;
import java.io.Serializable;

/**
 * @ClassName CommonResp
 * @Description 通用返回数据包
 * @Author FARO_Z
 * @Date 2021/5/5 下午10:38
 * @Version 1.0
 **/
public class CommonResp<T> implements Serializable {

    /**
     * 错误信息
     */
    private String message;

    /**
     * 是否成功
     */
    private boolean success = true;

    /**
     * 返回的内容
     */
    private T content;

    public CommonResp(String message, boolean success, T content) {
        this.message = message;
        this.success = success;
        this.content = content;
    }

    public CommonResp() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "CommonResp{" +
                "message='" + message + '\'' +
                ", success=" + success +
                ", content=" + content +
                '}';
    }
}
