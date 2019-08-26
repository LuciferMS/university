package com.university.commen.mapper.support;

import com.university.commen.mapper.SqlCondition;
import com.university.commen.mapper.SqlExampleBuilder;

import java.util.LinkedList;
import java.util.List;

/**
 * @program: university
 * @description: AbstractSqlExampleBuilder
 * @author: Elliot
 * @create: 2019-08-25 00:21
 **/
public class AbstractSqlExampleBuilder implements SqlExampleBuilder {

    protected List<SqlCondition> sqlConditions = new LinkedList<SqlCondition>();

    public SqlExampleBuilder build() {
        return null;
    }

    public SqlExampleBuilder addSqlCondition(SqlCondition sqlCondition) {
        sqlConditions.add(sqlCondition);
        return this;
    }

    public AbstractSqlExampleBuilder() {
    }
}
