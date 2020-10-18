package com.soft1851.springboot.usercenter.domain.dto;

import com.soft1851.springboot.usercenter.domain.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 黄启佳
 * @description TODO
 * @Data 2020/10/13
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class LoginRespDto {
    private UserRespDto user;
    private JwtTokenRespDto token;
}
