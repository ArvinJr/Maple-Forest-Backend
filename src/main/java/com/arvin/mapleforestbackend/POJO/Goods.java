package com.arvin.mapleforestbackend.POJO;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品信息表的实体类
 *
 * @author arvin
 */
@Data
public class Goods {
    private Long goodsId;

    private String goodsName;

    private BigDecimal goodsPrice;

    private Integer goodsNumber;

    private Double goodsWeight;

    private Boolean alarm;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;
}