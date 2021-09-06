package com.duqi.service.impl;

import com.duqi.bean.User;
import com.duqi.dao.JdbcTemplateDao;
import com.duqi.service.JdbcTemplateService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author dengyong
 * @description
 * @create 2021/9/6 15:06
 */
@Service
@Slf4j
@RequiredArgsConstructor
public class JdbcTemplateServiceImpl implements JdbcTemplateService {
    private final JdbcTemplateDao jdbcTemplateDao;
    @Override
    public User getUserInfo(Integer id) {
        return jdbcTemplateDao.getUserInfo(id);
    }

    @Override
    public int deleteUser(Integer id) {
        return jdbcTemplateDao.deleteUser(id);
    }

    @Override
    public int updateUserById(Integer id, String name) {
        return jdbcTemplateDao.updateUserById(id,name);
    }

    @Override
    public int addUser(String name) {
        return jdbcTemplateDao.addUser(name);
    }
}
