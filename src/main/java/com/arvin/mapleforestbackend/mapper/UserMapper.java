package com.arvin.mapleforestbackend.mapper;

import com.arvin.mapleforestbackend.POJO.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户信息表
 *
 * @author arvin
 */
@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(User record);

    User selectByPrimaryKey(Long userId);

    List<User> selectAll();

    int updateByPrimaryKey(User record);
}