package com.soft1851.springboot.contentcenter.service;

import com.github.pagehelper.PageInfo;
import com.soft1851.springboot.contentcenter.domain.dto.*;
import com.soft1851.springboot.contentcenter.domain.entity.Share;
import com.soft1851.springboot.contentcenter.mapper.ShareMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 黄启佳
 * @description TODO
 * @Data 2020/10/14
 */

public interface ShareService {

    /**
     * 获得分享详情
     * @param id
     * @return
     */
    ShareDto findById(Integer id);

    /**
     * 根据用户查询分享列表
     * @param title
     * @param pageNo
     * @param pageSize
     * @param userId
     * @return
     */
    PageInfo<Share> query(String title,Integer pageNo,Integer pageSize,Integer userId);


    /**
     * 投稿
     * @param contributeShareDto
     * @return
     */
    Share contributeShare(ContributeShareDto contributeShareDto);

    /**
     *
     * 更新状态
     * @param auditStatusDto
     * @return
     */
    Share auditStatusById(AuditStatusDto auditStatusDto);

    /**
     * 根据用户查询我的投稿列表
     * @param pageNo
     * @param pageSize
     * @param userId
     * @return
     */
    PageInfo<Share> queryMyContribute(Integer pageNo,Integer pageSize,Integer userId);

    /**
     * 积分兑换资源
     *
     * @param exchangeDto
     * @return Share
     */
    Share exchange(ExchangeDto exchangeDto);

    /**
     * 根据用户id查询我的兑换
     * @param pageNo
     * @param pageSize
     * @param userId
     * @return
     */
    PageInfo<Share> queryMyExchange(Integer pageNo,Integer pageSize,Integer userId);


    /**
     * 编辑投稿
     * @param updateShareDto
     * @return
     */
    int updateContribute(UpdateShareDto updateShareDto);


    /**
     * 获取待审核分享列表
     * @return
     */
    List<Share> QueryNotYetShares();
}
