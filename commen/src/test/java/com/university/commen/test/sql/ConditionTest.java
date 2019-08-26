package com.university.commen.test.sql;

import com.university.commen.mapper.SqlCondition;
import com.university.commen.mapper.support.ConditionOperator;
import com.university.commen.mapper.support.DefaultInsertCondition;
import com.university.commen.mapper.support.DefaultSelectCondition;
import org.junit.Test;

/**
 * @program: university
 * @description: conditionTest
 * @author: Elliot
 * @create: 2019-08-24 23:42
 **/
public class ConditionTest {

    /**
     * 构建sqlCondition过程
     */
    @Test
    public void conditionBuildTest(){
        DefaultSelectCondition selectCondition = new DefaultSelectCondition("username", ConditionOperator.EQUALS, "Elliot");
    }

}
