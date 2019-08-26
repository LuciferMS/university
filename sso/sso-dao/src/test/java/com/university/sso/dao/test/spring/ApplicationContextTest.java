package com.university.sso.dao.test.spring;

import com.university.sso.dao.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: university
 * @description: 测试bean容器
 * @author: Elliot
 * @create: 2019-08-23 11:36
 **/
public class ApplicationContextTest {

    private ApplicationContext applicationContext;

    @Before
    public void init(){
        applicationContext = new ClassPathXmlApplicationContext("application/application-context.xml");
    }

    @Test
    public void initApplicationContextTest(){
        Assert.assertNotNull(applicationContext);
    }

    @Test
    public void getMapper(){
        UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
        Assert.assertNotNull(userMapper);
    }

}
