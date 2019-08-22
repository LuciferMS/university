package com.university.forum.innerweb.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.university.commen.domain.sso.User;
import com.university.sso.service.api.user.UserApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: university
 * @description: userWeb
 * @author: Elliot
 * @create: 2019-08-22 19:11
 **/
@RestController
public class UserController {

    @Reference
    private UserApi userApi;

    @RequestMapping("/userLogin")
    public ResponseEntity<String> userLogin(User user){
        userApi.userLogin(user);
        return null;
    }
}
