package com.arvin.mapleforestbackend.POJO;

import lombok.Data;

/**
 * 角色与菜单表的关联表的实体类
 *
 * @author arvin
 */
@Data
public class RoleMenu {
    private Long roleId;

    private Long menuId;
}