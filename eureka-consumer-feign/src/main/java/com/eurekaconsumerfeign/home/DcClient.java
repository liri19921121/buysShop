package com.eurekaconsumerfeign.home;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * name为服务器名字，dc为方法名字
 */
@FeignClient(name = "eureka-producer")
public interface DcClient {
    @GetMapping("/dc")
    String consumer();
}



