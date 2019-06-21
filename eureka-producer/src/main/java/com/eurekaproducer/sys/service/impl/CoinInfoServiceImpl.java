package com.eurekaproducer.sys.service.impl;

import com.eurekaproducer.sys.entity.CoinInfo;
import com.eurekaproducer.sys.mapper.CoinInfoMapper;
import com.eurekaproducer.sys.service.ICoinInfoService;
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
public class CoinInfoServiceImpl extends ServiceImpl<CoinInfoMapper, CoinInfo> implements ICoinInfoService {

}
