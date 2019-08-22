package com.university.sso.service.service.api;

import com.alibaba.dubbo.config.annotation.Service;
import com.university.commen.domain.sso.Token;
import com.university.commen.domain.sso.User;
import com.university.sso.service.api.user.UserApi;

/**
 * @program: university
 * @description: userApiImpl
 * @author: Elliot
 * @create: 2019-08-22 19:19
 **/
@Service
public class UserApiImpl implements UserApi {

    @Override
    public Token userLogin(User user) {
        System.out.println(user);
        return null;
    }

}
