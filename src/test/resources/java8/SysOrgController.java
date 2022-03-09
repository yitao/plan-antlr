/**
 * readme
 */
package com.haizhi.graphary.server.controller.sys;

import javax.validation.Valid;

import com.graph.atlas.common.base.model.PageResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.haizhi.graphary.model.qo.sys.SysOrgPageQo;
import com.haizhi.graphary.model.vo.sys.SysOrgVo;
import com.haizhi.graphary.sys.service.GrapharySysOrgService;

/**
 * @Author yitao
 * @Created 2022/02/11
 */
@Api(tags = "[组织管理]")
@RestController
@RequestMapping("/sys/org")
public class SysOrgController {

    //这是一个单行注释
    @Autowired
    private GrapharySysOrgService sysOrgService;

    @ApiOperation(value = "分页查询组织信息")
    @PostMapping(value = "/findPage")
    public PageResponse<SysOrgVo> findPage(
            @ApiParam(value = "请求参数", required = true) @RequestBody @Valid SysOrgPageQo qo) {
        return sysOrgService.findPage(qo);
    }

}
