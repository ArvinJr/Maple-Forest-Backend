package com.arvin.mapleforestbackend.POJO;

import lombok.Data;

/**
 * 订单与商品表的关联表的实体类
 *
 * @author arvin
 */
@Data
public class OrderGoods {
    private Long orderId;

    private Long goodsId;
}