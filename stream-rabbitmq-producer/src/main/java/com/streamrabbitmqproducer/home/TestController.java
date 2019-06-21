package com.streamrabbitmqproducer.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
/*@EnableBinding(TestTopic.class)*/
@EnableBinding(TestTopic.class)
public class TestController {

    /*@Autowired
    private TestTopic testTopic;*/

    @Autowired
    private TestTopic testTopic;

    @GetMapping("/sendMessage")
    public String messageWithMQ(@RequestParam String message) {
        for (int i = 0; i < 10; i++) {
            testTopic.output().send(MessageBuilder.withPayload(message+i).build());
        }
        return "ok";
    }
}
