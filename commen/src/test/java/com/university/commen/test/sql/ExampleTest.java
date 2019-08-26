package com.university.commen.test.sql;

import org.junit.Test;

/**
 * @program: university
 * @description: exampleTest
 * @author: Elliot
 * @create: 2019-08-24 23:44
 **/
public class ExampleTest {

    /**
     * 构建查询实例过程
     */
    @Test
    public void exampleBuildTest(){
        UserSqlExampleBuilder userSqlExampleBuilder = new UserSqlExampleBuilder();
        userSqlExampleBuilder.equalsByUserName("Elliot");
        UserSqlExample userSqlExample = new UserSqlExample(userSqlExampleBuilder);
    }

}
