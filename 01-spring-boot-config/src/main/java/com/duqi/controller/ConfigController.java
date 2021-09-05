package com.duqi.controller;

import com.duqi.bean.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dengyong
 * @Title:
 * @Description:
 * @date 2021/9/5 14:46
 */
@Slf4j
@RestController
@RequiredArgsConstructor
public class ConfigController {
    private final User user;
    @GetMapping("/getUserInfo")
    public String getUserInfo() {
        log.info("number:"+user.getNumber());
        return "id:"+user.getId()+"  name:"+user.getUsername();
    }
}
