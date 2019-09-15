package com.university.forum.outer.dao.po;

import java.sql.Timestamp;

/**
 * @program: university
 * @description: 评论
 * @author: Elliot
 * @create: 2019-09-05 23:22
 **/
public class Comment {
    /**
     * id
     */
    private String mid;
    /**
     * 发布用户
     */
    private String uid;
    /**
     * 内容
     */
    private String content;
    /**
     * 创建时间
     */
    private Timestamp createTime;
    /**
     * 最后一次更新时间
     */
    private Timestamp lastUpdateTime;

    /**
     * 状态
     */
    private Integer status;
}
