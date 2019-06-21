package com.streamrabbitmqproducer.home;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface TestTopic {
    String OUTPUT = "example-topic";

    @Output(OUTPUT)
    MessageChannel output();

}
