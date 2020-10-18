package com.soft1851.springboot.contentcenter.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 黄启佳
 * @description TODO
 * @Data 2020/10/14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ExchangeDto {
    private Integer userId;
    private Integer shareId;
}
