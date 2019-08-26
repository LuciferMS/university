package com.university.commen.mapper.support;

/**
 * @program: university
 * @description: ConditionOperator
 * @author: Elliot
 * @create: 2019-08-26 21:13
 **/
public enum ConditionOperator {

    EQUALS("="), IN("IN"), LESS("<"), MORE(">");

    String value;

    ConditionOperator(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
