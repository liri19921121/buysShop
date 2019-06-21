package com.eurekacenter;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaCenterApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaCenterApplication.class)
                .web(true).run(args);
    }

}
