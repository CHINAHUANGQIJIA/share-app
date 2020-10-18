package com.soft1851.springboot.contentcenter.configeration;

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * @author 黄启佳
 * @description TODO
 * @Data 2020/10/14
 */
public class UserCenterFeignConfiguration {
    @Bean
    public Logger.Level level(){
        return Logger.Level.FULL;
    }
}
