package com.eurekaproducer.home.controller;


import com.eurekaproducer.home.service.IGoodsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 商品信息 前端控制器
 * </p>
 *
 * @author rstyro
 * @since 2019-02-25
 */
@RestController
@RequestMapping("/shop/goods")
@Api(tags = "商城相关")
public class GoodsController {

    @Autowired
    private IGoodsService goodsService;


    /**
     * 商品详情
     *
     * @param goodId
     * @return
     * @throws Exception
     */
    @ApiOperation("商品详情")
    @PostMapping("/getGoodsDetail")
    public Object getGoodsDetail(Integer goodId) throws Exception {
        return goodsService.getGoodsDetail(goodId);
    }

    @ApiOperation("根据名字查询商品详情")
    @PostMapping("/getGoodsDetailByGoodsName")
    public Object getGoodsDetailByGoodsName(String  goodsName) throws Exception {
        return goodsService.getGoodsDetailByGoodsName(goodsName);
    }

}
