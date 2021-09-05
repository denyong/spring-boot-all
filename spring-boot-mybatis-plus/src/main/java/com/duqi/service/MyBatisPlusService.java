package com.duqi.service;

import com.duqi.entity.User;

/**
 * @author dengyong
 */
public interface MyBatisPlusService {
    /**
     * 获取user
     *
     * @param id
     * @return
     */
    User getUserInfo(Integer id);
}
