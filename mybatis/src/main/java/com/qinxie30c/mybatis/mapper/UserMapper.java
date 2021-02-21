package com.qinxie30c.mybatis.mapper;

import com.qinxie30c.mybatis.entity.UserEntity;

import java.util.List;

/**
 * @auther qinxie30c
 * @date 2021/2/21 9:49 上午
 * @desc:
 */
public interface UserMapper {

    List<UserEntity> selectList();
}