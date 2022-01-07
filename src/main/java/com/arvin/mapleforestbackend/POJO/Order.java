package com.arvin.mapleforestbackend.POJO;

import lombok.Data;

import java.util.Date;

/**
 * 订单信息表的实体类
 *
 * @author arvin
 */
@Data
public class Order {
    private Long orderId;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;
}