package com.duqi.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author dengyong
 * @Title:
 * @Description:
 * @date 2021/9/3 14:55
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;
}
