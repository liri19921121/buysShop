package com.eurekaproducer.sys.service.impl;

import com.eurekaproducer.sys.entity.CoinPrice;
import com.eurekaproducer.sys.mapper.CoinPriceMapper;
import com.eurekaproducer.sys.service.ICoinPriceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author rstyro
 * @since 2019-06-13
 */
@Service
public class CoinPriceServiceImpl extends ServiceImpl<CoinPriceMapper, CoinPrice> implements ICoinPriceService {

}
