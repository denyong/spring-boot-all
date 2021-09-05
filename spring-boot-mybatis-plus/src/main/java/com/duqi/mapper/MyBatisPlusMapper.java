package com.duqi.mapper;

import com.duqi.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author dengyong
 * @Title:
 * @Description:
 * @date 2021/9/3 15:20
 */
@Mapper
public interface MyBatisPlusMapper {
    /**
     * 获取user
     *
     * @param id
     * @return
     */
    User getUserInfo(@Param("id") Integer id);
}
