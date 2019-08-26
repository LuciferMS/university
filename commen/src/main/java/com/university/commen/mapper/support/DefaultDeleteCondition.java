package com.university.commen.mapper.support;

import com.university.commen.mapper.ConditionAble;

/**
 * @program: university
 * @description: DefaultDeleteCondition
 * @author: Elliot
 * @create: 2019-08-24 23:27
 **/
public class DefaultDeleteCondition extends AbstractConditionAble {

    protected DefaultDeleteCondition(String property, String condition, Object values) {
        super(property, condition, values);
    }

    public ConditionAble where(String property, ConditionOperator condition, Object values) {
        return null;
    }
}
