package com.arvin.mapleforestbackend.mapper;

import com.arvin.mapleforestbackend.POJO.UserOrder;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户与订单表的关联表
 *
 * @author arvin
 */
@Repository
public interface UserOrderMapper {
    int deleteByPrimaryKey(@Param("userId") Long userId, @Param("orderId") Long orderId);

    int insert(UserOrder record);

    List<UserOrder> selectAll();
}