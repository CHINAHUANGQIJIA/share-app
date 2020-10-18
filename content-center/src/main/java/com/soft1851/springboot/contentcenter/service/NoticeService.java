package com.soft1851.springboot.contentcenter.service;

import com.soft1851.springboot.contentcenter.domain.entity.Notice;

/**
 * @author 黄启佳
 * @description TODO
 * @Data 2020/10/14
 */
public interface NoticeService {

    Notice getLatest();
}
