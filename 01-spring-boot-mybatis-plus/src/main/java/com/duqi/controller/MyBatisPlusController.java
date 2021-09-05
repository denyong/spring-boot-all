package com.duqi.controller;

import com.duqi.entity.User;
import com.duqi.service.MyBatisPlusService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dengyong
 */
@RestController
@Slf4j
@RequiredArgsConstructor
public class MyBatisPlusController {
    private final MyBatisPlusService myBatisPlusService;

    @GetMapping("/getUserInfo")
    public User getUserInfo(@RequestParam Integer id) {
        log.info("id:{}", id);
        return myBatisPlusService.getUserInfo(id);
    }
}





