package com.eurekaproducer.home.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.eurekaproducer.home.entity.Goods;

/**
 * <p>
 * 商品信息 服务类
 * </p>
 *
 * @author rstyro
 * @since 2019-02-25
 */
public interface IGoodsService extends IService<Goods> {

    public Object getGoodsDetail(Integer goodId) throws Exception;
    public Object getGoodsDetailByGoodsName(String goodsName) throws Exception;

}
