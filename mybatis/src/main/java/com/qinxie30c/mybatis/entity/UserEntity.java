package com.qinxie30c.mybatis.entity;

import lombok.Data;

/**
 * @auther qinxie30c
 * @date 2021/2/21 9:48 上午
 * @desc:
 */
@Data
public class UserEntity {
    private String username;
    private String password;
    private Integer enabled;
    private long id;
}