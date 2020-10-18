package com.soft1851.springboot.contentcenter.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author 黄启佳
 * @description TODO
 * @Data 2020/10/14
 */

@Getter
@AllArgsConstructor
public enum AuditStatusEnum {
    /**
     * 待审核
     */
    NOT_YET,
    /**
     * 审核通过
     */
    PASSED,
    /**
     * 审核不通过
     */
    REJECT
}
