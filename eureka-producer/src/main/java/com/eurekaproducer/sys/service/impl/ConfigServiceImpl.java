package com.eurekaproducer.sys.service.impl;

import com.eurekaproducer.sys.entity.Config;
import com.eurekaproducer.sys.mapper.ConfigMapper;
import com.eurekaproducer.sys.service.IConfigService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统配置项 服务实现类
 * </p>
 *
 * @author rstyro
 * @since 2019-06-13
 */
@Service
public class ConfigServiceImpl extends ServiceImpl<ConfigMapper, Config> implements IConfigService {

}
