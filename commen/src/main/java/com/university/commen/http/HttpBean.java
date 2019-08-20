package com.university.commen.http;

/**
 * @program: university
 * @description: http json格式通用bean
 * @author: Elliot
 * @create: 2019-08-13 21:01
 **/
public class HttpBean<T> {
    /**
     * http状态码
     */
    private String status;

    /**
     * 数据
     */
    private T data;
}
