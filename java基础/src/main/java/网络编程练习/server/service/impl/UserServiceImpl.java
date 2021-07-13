package 网络编程练习.server.service.impl;

import 网络编程练习.server.dao.UserDao;
import 网络编程练习.server.dao.impl.UserDaoImpl;
import 网络编程练习.server.pojo.User;
import 网络编程练习.server.req.LoginReq;
import 网络编程练习.server.resp.LoginResp;
import 网络编程练习.server.service.UserService;

import java.util.Objects;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/5 下午10:44
 * @Version 1.0
 **/
public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImpl();

    @Override
    public LoginResp userLogin(LoginReq req) {
        User user = userDao.selectByName(req.getName(), req.getIdentity());
        /**
         * 判断数据库中有没有这个人
         */
        if (user==null) {
            LoginResp resp = new LoginResp();
            resp.setMessage("【错误】查无此人");
            return resp;
        }
        /**
         * 判断密码是否匹配
         */
        if (!Objects.equals(req.getPassword(),user.getPassword())) {
            LoginResp resp = new LoginResp();
            resp.setMessage("【错误】密码不匹配");
            return resp;
        }

        LoginResp resp = new LoginResp();
        resp.setIndentity(req.getIdentity());
        resp.setName(user.getName());
        resp.setMessage("登录成功，欢迎:"+user.getName());
        return resp;
    }
}
