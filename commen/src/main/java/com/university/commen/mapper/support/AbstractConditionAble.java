package com.university.commen.mapper.support;

import com.university.commen.mapper.ConditionAble;

/**
 * @program: university
 * @description: abstractConditionAble
 * @author: Elliot
 * @create: 2019-08-26 20:28
 **/
public abstract class AbstractConditionAble extends AbstractSqlCondition
        implements ConditionAble{

    protected final String property;
    protected final String condition;
    protected final Object values;

    protected AbstractConditionAble(String property, String condition, Object values) {
        this.property = property;
        this.condition = condition;
        this.values = values;
    }

}
