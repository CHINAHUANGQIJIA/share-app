package com.soft1851.springboot.contentcenter.controller;

import com.soft1851.springboot.contentcenter.domain.dto.AuditStatusDto;
import com.soft1851.springboot.contentcenter.domain.entity.Share;
import com.soft1851.springboot.contentcenter.service.ShareService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 黄启佳
 * @description TODO
 * @Data 2020/10/14
 */
@RestController
@RequestMapping(value = "/admin")
@Api(tags = "管理员接口",value = "提供管理员相关的Rest API")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AdminController {

    private final ShareService shareService;

    @PostMapping(value = "/shares/audit")
    @ApiOperation(value = "修改状态", notes = "修改状态")
    public Share updateAuditStatus(@RequestBody AuditStatusDto auditStatusDto){
         return this.shareService.auditStatusById(auditStatusDto);
    }
}
