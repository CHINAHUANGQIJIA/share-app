package com.soft1851.springboot.usercenter.service;

import com.soft1851.springboot.usercenter.domain.entity.BonusEventLog;

import java.util.List;

/**
 * @author 黄启佳
 * @description TODO
 * @Data 2020/10/13
 */
public interface BonusEventLogService {
    /**
     * 查询积分明细
     * @param id
     * @return
     */
    List<BonusEventLog> queryLog(Integer userId);
}
