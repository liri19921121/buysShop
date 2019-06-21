package com.streamrabbitmqconsumer.home;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface TestTopic {
    String INPUT = "example-topic";

    @Input(INPUT)
    SubscribableChannel input();
}
