package com.soft1851.springboot.usercenter.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 黄启佳
 * @description TODO
 * @Data 2020/10/13
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResponseDto {
    private Boolean succ;
    private String code;
    private String msg;
    private Object data;
    private Long ts;
}
