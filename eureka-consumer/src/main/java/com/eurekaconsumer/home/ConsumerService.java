package com.eurekaconsumer.home;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumerService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "error", commandProperties = {@HystrixProperty(name = "execution.isolation.strategy", value = "THREAD")
            , @HystrixProperty(name = "execution.timeout.enabled", value = "true"),
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "12000")
    })
    public String consumer() {
        return restTemplate.getForObject("http://eureka-producer/dc", String.class);
    }

    public String error() {
        return "接口异常，请稍后重试";
    }
}
