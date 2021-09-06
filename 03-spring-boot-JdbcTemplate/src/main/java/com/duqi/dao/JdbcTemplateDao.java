package com.duqi.dao;

import com.duqi.bean.User;

/**
 * @author dengyong
 * @description
 * @create 2021/9/6 15:09
 */
public interface JdbcTemplateDao {
    /**
     * 获取用户信息
     *
     * @return
     * @param id
     */
    User getUserInfo(Integer id);

    /**
     * 删除用户
     *
     * @return
     * @param id
     */
    int deleteUser(Integer id);

    /**
     * 更新用户
     *
     * @return
     * @param id
     * @param name
     */
    int updateUserById(Integer id, String name);

    /**
     * 添加用户
     *
     * @return
     * @param name
     */
    int addUser(String name);
}
