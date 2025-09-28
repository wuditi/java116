package com.wn.day37.template;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.web.client.RestTemplate;

import java.util.function.Function;

@Configuration
public class RestTemplateConfig {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
    /**
     * 配置Function函数
     */
    @Bean
    @Description("根据编号查询楼宇信息")
    public Function<Object, String> buildingFunction() {
        return new BuildingFunction();
    }
}

}
