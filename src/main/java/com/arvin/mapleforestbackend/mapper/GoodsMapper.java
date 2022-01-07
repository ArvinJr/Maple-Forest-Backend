package com.arvin.mapleforestbackend.mapper;

import com.arvin.mapleforestbackend.POJO.Goods;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 商品信息表
 *
 * @author arvin
 */
@Repository
public interface GoodsMapper {
    int deleteByPrimaryKey(Long goodsId);

    int insert(Goods record);

    Goods selectByPrimaryKey(Long goodsId);

    List<Goods> selectAll();

    int updateByPrimaryKey(Goods record);
}