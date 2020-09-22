package com.soft1851.qjcoursecenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author 小半吻
 */
@SpringBootApplication
@MapperScan(basePackages = "com.soft1851.qjcoursecenter.dao")
public class CourseCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(CourseCenterApplication.class, args);
    }
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
