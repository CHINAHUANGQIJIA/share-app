package com.soft1851.springboot.contentcenter.configeration;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.context.annotation.Configuration;
import ribbonconfig.RibbonConfiguration;

/**
 * @author 黄启佳
 * @description TODO
 * @Data 2020/10/14
 */
@Configuration
@RibbonClient(name = "user-center",configuration = RibbonConfiguration.class)
//@RibbonClients(defaultConfiguration = RibbonConfiguration.class)
public class UserCenterRibbonConfig {
}
