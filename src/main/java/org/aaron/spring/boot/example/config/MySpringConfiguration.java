package org.aaron.spring.boot.example.config;

import org.aaron.spring.boot.example.service.MyService;
import org.aaron.spring.boot.example.service.impl.MyServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySpringConfiguration {

    @Bean
    public MyService myService() {
        return new MyServiceImpl();
    }
}
