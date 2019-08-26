package com.university.commen.mapper.support;

import com.university.commen.mapper.ConditionAble;

/**
 * @program: university
 * @description: DefaultUpdateCondition
 * @author: Elliot
 * @create: 2019-08-24 23:26
 **/
public class DefaultUpdateCondition extends AbstractConditionAble {

    protected DefaultUpdateCondition(String property, String condition, Object values) {
        super(property, condition, values);
    }

    public ConditionAble where(String property, ConditionOperator condition, Object values) {
        return null;
    }
}
