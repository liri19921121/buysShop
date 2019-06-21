package com.eurekaproducer.home.service.impl;

import com.alipay.api.domain.GoodsDetail;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.eurekaproducer.home.dto.GoodsDTO;
import com.eurekaproducer.home.entity.Goods;
import com.eurekaproducer.home.mapper.GoodsMapper;
import com.eurekaproducer.home.service.IGoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author rstyro
 * @since 2019-02-25
 */
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements IGoodsService {

    private static final Logger logger = LoggerFactory.getLogger(GoodsServiceImpl.class);

    @Resource
    private GoodsMapper goodsMapper;


    public Object getGoodsDetail(Integer goodId) throws Exception {
        Goods goods = this.getById(goodId);
        return goods;
    }

    public Object getGoodsDetailByGoodsName(String  goodsName) throws Exception {
        Page<GoodsDTO> pages = new Page<>(10, 1);
        pages.setRecords(goodsMapper.getGoods(pages,goodsName));
        HashMap map = new HashMap();
        map.put("data",pages);
        return map;
    }


}
