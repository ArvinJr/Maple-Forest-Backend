package com.arvin.mapleforestbackend.POJO;

import lombok.Data;

import java.util.Date;

/**
 * 角色信息表的实体类
 *
 * @author arvin
 */
@Data
public class Role {
    private Long roleId;

    private String roleName;

    private String roleKey;

    private Boolean status;

    private Boolean delFlag;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;
}