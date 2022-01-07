package com.arvin.mapleforestbackend.mapper;

import com.arvin.mapleforestbackend.POJO.OrderGoods;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 订单与商品表的关联表
 *
 * @author arvin
 */
@Repository
public interface OrderGoodsMapper {
    int deleteByPrimaryKey(@Param("orderId") Long orderId, @Param("goodsId") Long goodsId);

    int insert(OrderGoods record);

    List<OrderGoods> selectAll();
}