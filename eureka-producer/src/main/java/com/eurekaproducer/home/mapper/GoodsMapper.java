package com.eurekaproducer.home.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.eurekaproducer.home.dto.GoodsDTO;
import com.eurekaproducer.home.entity.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 商品信息 Mapper 接口
 * </p>
 *
 * @author rstyro
 * @since 2019-02-25
 */
public interface GoodsMapper extends BaseMapper<Goods> {
    public List<GoodsDTO> getGoods(Page<GoodsDTO> page, @Param("goodsName") String  goodsName);
}
