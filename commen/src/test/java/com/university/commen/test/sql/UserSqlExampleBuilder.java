package com.university.commen.test.sql;

import com.university.commen.mapper.support.AbstractSqlExampleBuilder;
import com.university.commen.mapper.support.ConditionOperator;
import com.university.commen.mapper.support.DefaultSelectCondition;

/**
 * @program: university
 * @description: userSqlExampleBuilder
 * @author: Elliot
 * @create: 2019-08-25 00:12
 **/
public class UserSqlExampleBuilder extends AbstractSqlExampleBuilder {

    public UserSqlExampleBuilder equalsByUserName(String username) {
        addSqlCondition(new DefaultSelectCondition("username", ConditionOperator.EQUALS, username));
        return this;
    }
}
