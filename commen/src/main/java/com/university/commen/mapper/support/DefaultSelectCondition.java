package com.university.commen.mapper.support;


import com.university.commen.mapper.ConditionAble;

/**
 * @program: university
 * @description: DefaultSelectCondition
 * @author: Elliot
 * @create: 2019-08-24 23:25
 **/
public class DefaultSelectCondition extends AbstractConditionAble {

    public ConditionAble where(String property, ConditionOperator operator, Object values) {
        return new DefaultSelectCondition(property, operator, values);
    }

    public DefaultSelectCondition(String property, ConditionOperator operator, Object values) {
        super(property, operator.getValue(), values);
    }
}