package com.university.commen.mapper;

/**
 * @program: university
 * @description: sqlExampleBuilder
 * @author: Elliot
 * @create: 2019-08-24 23:56
 **/
public interface SqlExampleBuilder {
    /**
     * SqlExampleBuilder
     * @return SqlExampleBuilder
     */
    SqlExampleBuilder build();

    /**
     * 条件sql条件
     * @param sqlCondition 条件
     * @return SqlExampleBuilder
     */
    SqlExampleBuilder addSqlCondition(SqlCondition sqlCondition);
}
