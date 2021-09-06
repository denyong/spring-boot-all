package com.duqi.bean;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @author dengyong
 * @Title:
 * @Description:
 * @date 2021/9/5 14:46
 */
@Data
@Builder
public class User implements Serializable {
    private static final long serialVersionUID = -339516038496531943L;
    
    private int id;

    private String username;
}
