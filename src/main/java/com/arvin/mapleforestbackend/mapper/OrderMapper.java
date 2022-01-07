package com.arvin.mapleforestbackend.mapper;

import com.arvin.mapleforestbackend.POJO.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 订单信息表
 *
 * @author arvin
 */
@Repository
public interface OrderMapper {
    int deleteByPrimaryKey(Long orderId);

    int insert(Order record);

    Order selectByPrimaryKey(Long orderId);

    List<Order> selectAll();

    int updateByPrimaryKey(Order record);
}