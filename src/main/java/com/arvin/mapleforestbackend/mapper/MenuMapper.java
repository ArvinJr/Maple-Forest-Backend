package com.arvin.mapleforestbackend.mapper;

import com.arvin.mapleforestbackend.POJO.Menu;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 菜单信息表
 *
 * @author arvin
 */
@Repository
public interface MenuMapper {
    int deleteByPrimaryKey(Long menuId);

    int insert(Menu record);

    Menu selectByPrimaryKey(Long menuId);

    List<Menu> selectAll();

    int updateByPrimaryKey(Menu record);
}