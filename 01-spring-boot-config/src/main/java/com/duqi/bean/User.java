package com.duqi.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author dengyong
 * @Title:
 * @Description:
 * @date 2021/9/5 14:46
 */
@Data
@Component
public class User {
    @Value("${userinfo.id}")
    private int id;

    @Value("${userinfo.username}")
    private String username;

    @Value("#{'userinfo.username'}")
    private String number;
}
