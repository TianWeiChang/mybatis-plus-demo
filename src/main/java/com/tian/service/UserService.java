package com.tian.service;

import com.tian.entity.User;

import java.util.List;

/**
 * @author tianwc 公众号：java后端技术全栈、面试专栏
 * @version 1.0.0
 * @description 用户表操作
 * @createTime 2022年10月16日 22:51
 */
public interface UserService {
    /**
     * 查询列表
     */
    List<User> queryUserList();

    /**
     * 新增用户
     */
    boolean add(User user);

    /**
     * 更新用户信息
     */
    boolean update(User user);
}
