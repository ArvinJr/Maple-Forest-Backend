package com.arvin.mapleforestbackend.POJO;

import lombok.Data;

import java.util.Date;

/**
 * 用户信息表的实体类
 *
 * @author arvin
 */
@Data
public class User {
    private Long userId;

    private String userName;

    private String nickName;

    private String password;

    private Long phoneNumber;

    private String email;

    private Boolean status;

    private Boolean delFlag;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;

    private String remark;
}