package com.arvin.mapleforestbackend.POJO;

import lombok.Data;

/**
 * 用户与部门的关联表
 *
 * @author arvin
 */
@Data
public class UserDepartment {
    private Long userId;

    private Long departmentId;
}