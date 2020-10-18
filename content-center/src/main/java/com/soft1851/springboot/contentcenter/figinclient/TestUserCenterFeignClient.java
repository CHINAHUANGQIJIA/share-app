package com.soft1851.springboot.contentcenter.figinclient;

import com.soft1851.springboot.contentcenter.domain.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 黄启佳
 * @description TODO
 * @Data 2020/10/14
 */
@FeignClient(name = "user-center")
public interface TestUserCenterFeignClient {

    /**
     * 多参数查询
     * @param userDto
     * @return
     */
    @GetMapping("/user/q")
    UserDto query(UserDto userDto);
}
