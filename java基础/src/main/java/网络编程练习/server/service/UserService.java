package 网络编程练习.server.service;

import 网络编程练习.server.req.LoginReq;
import 网络编程练习.server.resp.LoginResp;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/5 下午10:44
 * @Version 1.0
 **/
public interface UserService {
    LoginResp userLogin(LoginReq req);
}
