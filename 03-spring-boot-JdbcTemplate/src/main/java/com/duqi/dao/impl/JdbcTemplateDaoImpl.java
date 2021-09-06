package com.duqi.dao.impl;

import com.duqi.bean.User;
import com.duqi.dao.JdbcTemplateDao;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Map;

/**
 * @author dengyong
 * @description
 * @create 2021/9/6 15:10
 */
@Repository("jdbcTemplateDao")
@RequiredArgsConstructor
public class JdbcTemplateDaoImpl implements JdbcTemplateDao {
    private final JdbcTemplate jdbcTemplate;

    @Override
    public User getUserInfo(Integer id) {
        String sql = "select * from user where id = ?";
        User user = jdbcTemplate.queryForObject(sql, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                return User.builder()
                        .id(resultSet.getInt(1))
                        .username(resultSet.getString(2))
                        .build();
            }
        }, id);
        return user;
    }

    @Override
    public int deleteUser(Integer id) {
        String sql = "delete from user where id = ?";
        return jdbcTemplate.update(sql, id);
    }

    @Override
    public int updateUserById(Integer id, String name) {
        String sql = "update user set name = ? where id  = ?";
        Object[] args = {name, id};
        int[] argTypes = {Types.VARCHAR, Types.INTEGER};
        return jdbcTemplate.update(sql, args, argTypes);
    }

    @Override
    public int addUser(String name) {
        String sql = "insert into user(name) values (?)";
        return jdbcTemplate.update(sql, name);
    }
}
