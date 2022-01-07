package com.arvin.mapleforestbackend.POJO;

import lombok.Data;

/**
 * 用户与订单表的关联表的实体类
 *
 * @author arvin
 */
@Data
public class UserOrder {
    private Long userId;

    private Long orderId;
}