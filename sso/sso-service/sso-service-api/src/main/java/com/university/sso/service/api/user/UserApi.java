package com.university.sso.service.api.user;


import com.university.commen.domain.sso.Token;
import com.university.commen.domain.sso.User;

/**
 * @program: university
 * @description: userApi
 * @author: Elliot
 * @create: 2019-08-22 19:16
 **/
public interface UserApi {

    /**
     * 用户在sso系统登录操作。。。
     * @param user
     * @return
     */
    Token userLogin(User user);

    /**
     * 用户注册
     * @param user
     * @return
     */
    Token userRegister(User user);
}
