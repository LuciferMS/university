package com.university.forum.outer.commen.domain;

import java.sql.Timestamp;
import java.util.List;

/**
 * @program: university
 * @description: 帖子
 * @author: Elliot
 * @create: 2019-09-05 23:15
 **/
public class Post {
    /**
     *id
     */
    private String postId;
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
     * 评论ids
     */
    private List<String> commentIds;
}
