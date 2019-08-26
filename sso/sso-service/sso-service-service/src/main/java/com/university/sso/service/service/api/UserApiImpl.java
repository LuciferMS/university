package com.university.sso.service.service.api;


import com.alibaba.dubbo.config.annotation.Service;
import com.university.commen.domain.sso.Token;
import com.university.commen.domain.sso.User;
import com.university.sso.dao.mapper.UserMapper;
import com.university.sso.service.api.user.UserApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * @program: university
 * @description: userApiImpl
 * @author: Elliot
 * @create: 2019-08-22 19:19
 **/
@Service
public class UserApiImpl implements UserApi {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private UserMapper userMapper;

    /**
     * sso系统主要要记录用户的登录状态。把token放置在redis缓存中
     * @param user
     * @return
     */
    @Override
    public Token userLogin(User user) {
        stringRedisTemplate.opsForValue().set("username", user.getUsername());
        return null;
    }

    @Override
    public Token userRegister(User user) {
        userMapper.saveBean(user);
        return null;
    }

}
