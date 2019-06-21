package com.eurekaproducer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Locale;

@EnableDiscoveryClient
@SpringBootApplication
@EnableSwagger2
@MapperScan({ "com.eurekaproducer.*.mapper", "com.eurekaproducer.*.*.mapper" })
public class EurekaProducerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(
                EurekaProducerApplication.class)
                .web(true).run(args);
    }

}
