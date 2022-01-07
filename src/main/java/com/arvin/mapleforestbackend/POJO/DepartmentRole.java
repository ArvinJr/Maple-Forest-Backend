package com.arvin.mapleforestbackend.POJO;

import lombok.Data;

/**
 * 部门与角色的关联表的实体类
 *
 * @author arvin
 */
@Data
public class DepartmentRole {
    private Long departmentId;

    private Long roleId;
}