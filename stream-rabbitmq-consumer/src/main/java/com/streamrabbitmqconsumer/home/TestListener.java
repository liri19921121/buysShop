package com.streamrabbitmqconsumer.home;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@Slf4j
@EnableBinding(TestTopic.class)
public class TestListener {

    @StreamListener(TestTopic.INPUT)
    public void receive(String payload) {
        log.info("收到消息: " + payload);
    }
}
