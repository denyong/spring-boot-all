package com.duqi.controller;


import com.duqi.bean.User;
import com.duqi.service.JdbcTemplateService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @author dengyong
 * @Title:
 * @Description:
 * @date 2021/9/5 14:46
 */
@Slf4j
@RestController
@RequiredArgsConstructor
public class JdbcTemplateController {
    private final JdbcTemplateService jdbcTemplateService;

    @GetMapping("/getUserInfo")
    public User getUserInfo(@RequestParam Integer id) {
        return jdbcTemplateService.getUserInfo(id);
    }

    @PostMapping("/addUser")
    public int addUser(@RequestParam String name) {
        return jdbcTemplateService.addUser(name);
    }

    @PutMapping("/updateUserById")
    public int updateUserById(@RequestParam Integer id,@RequestParam String name) {
        return jdbcTemplateService.updateUserById(id,name);
    }

    @DeleteMapping("/deleteUser")
    public int deleteUser(@RequestParam Integer id) {
        return jdbcTemplateService.deleteUser(id);
    }
}
