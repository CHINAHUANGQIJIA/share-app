package com.soft1851.springboot.contentcenter.domain.dto;

import com.soft1851.springboot.contentcenter.domain.AuditStatusEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 黄启佳
 * @description TODO
 * @Data 2020/10/14
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AuditStatusDto {
    private Integer id;

    private AuditStatusEnum auditStatusEnum;

    private String reason;

}
