package com.duqi.service.impl;

import com.duqi.entity.User;
import com.duqi.mapper.MyBatisPlusMapper;
import com.duqi.service.MyBatisPlusService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author dengyong
 */
@Service
@RequiredArgsConstructor
public class MyBatisPlusServiceImpl implements MyBatisPlusService {
    private final MyBatisPlusMapper myBatisPlusMapper;

    @Override
    public User getUserInfo(Integer id) {
        return myBatisPlusMapper.getUserInfo(id);
    }
}
