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
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateShareDto {
    private Integer shareId;

    private Integer userId;

    private String title;

    private Boolean isOriginal;

    private String author;

    private String cover;

    private String summary;

    private Integer price;

    private String downloadUrl;

    private String reason;
}
