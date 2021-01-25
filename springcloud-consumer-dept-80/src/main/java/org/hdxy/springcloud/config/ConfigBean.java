package org.hdxy.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {
    // 将RestTemplate注入到Spring
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
