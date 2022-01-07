package com.arvin.mapleforestbackend.POJO;

import lombok.Data;

import java.util.Date;

/**
 * 部门信息表的实体类
 *
 * @author arvin
 */
@Data
public class Department {
    private Long departmentId;

    private String departmentName;

    private String departmentKey;

    private Boolean status;

    private Boolean delFlag;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;
}