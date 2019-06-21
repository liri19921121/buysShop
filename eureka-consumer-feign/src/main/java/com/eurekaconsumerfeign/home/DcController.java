package com.eurekaconsumerfeign.home;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DcController {
    @Autowired
    private DcClient dcClient;

    @GetMapping("/consumer")
    //https://www.cnblogs.com/520playboy/p/8074347.html
    //https://www.cnblogs.com/ywjfx/p/10556521.html   THREAD, SEMAPHORE
    @HystrixCommand(fallbackMethod = "defaultMethod", commandProperties = {@HystrixProperty(name = "execution.isolation.strategy", value = "THREAD")
            , @HystrixProperty(name = "execution.timeout.enabled", value = "true"),
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000")
    })
    public String dc() {
        return dcClient.consumer();
    }

    public String defaultMethod() {
        return "接口异常";
    }
}
