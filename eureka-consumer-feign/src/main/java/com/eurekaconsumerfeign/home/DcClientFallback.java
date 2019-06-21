package com.eurekaconsumerfeign.home;

import org.springframework.stereotype.Component;

@Component
public class DcClientFallback {
    public String consumer() {
        return "接口查询异常";
    }
}
