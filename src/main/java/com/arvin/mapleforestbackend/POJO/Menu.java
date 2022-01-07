package com.arvin.mapleforestbackend.POJO;

import lombok.Data;

import java.util.Date;

/**
 * 菜单信息表的实体类
 *
 * @author arvin
 */
@Data
public class Menu {
    private Long menuId;

    private String icon;

    private String menuName;

    private Long parentId;

    private Long orderValue;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;
}