package com.university.commen.mapper;

import com.university.commen.mapper.support.ConditionOperator;

/**
 * @program: university
 * @description: updateAble
 * @author: Elliot
 * @create: 2019-08-26 20:14
 **/
public interface ConditionAble {

    /**
     * where条件
     * @param property 属性
     * @param condition where条件，>,=,<,in
     * @param values 属性值
     * @return
     */
    ConditionAble where(String property, ConditionOperator condition, Object values);

}
