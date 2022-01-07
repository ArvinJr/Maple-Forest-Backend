package com.arvin.mapleforestbackend.mapper;

import com.arvin.mapleforestbackend.POJO.RoleMenu;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 角色与菜单表的关联表
 *
 * @author arvin
 */
@Repository
public interface RoleMenuMapper {
    int deleteByPrimaryKey(@Param("roleId") Long roleId, @Param("menuId") Long menuId);

    int insert(RoleMenu record);

    List<RoleMenu> selectAll();
}