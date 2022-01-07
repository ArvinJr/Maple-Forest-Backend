package com.arvin.mapleforestbackend.mapper;

import com.arvin.mapleforestbackend.POJO.Role;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 角色信息表
 *
 * @author arvin
 */
@Repository
public interface RoleMapper {
    int deleteByPrimaryKey(Long roleId);

    int insert(Role record);

    Role selectByPrimaryKey(Long roleId);

    List<Role> selectAll();

    int updateByPrimaryKey(Role record);
}