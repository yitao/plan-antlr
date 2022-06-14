/**
 * 包注释
 */
package com.haizhi.graphary.server.controller.sys;
/*
引用的注释1
 */
import javax.validation.Valid;

import com.graph.atlas.common.base.model.PageResponse;
//引用的注释2
import io.swagger.annotations.ApiParam;


/**
 * @Author yitao
 * @Created 2022/02/11
 */
@Api(tags = "[组织管理]")
@RestController
@RequestMapping("/sys/org")
public class SysOrgController {

    /**
     * 构造方法
     *
     * @param sysOrgService
     */
    public SysOrgController(GrapharySysOrgService sysOrgService) {
        this.sysOrgService = sysOrgService;
    }

    //这是一个单行注释
    @Autowired
    private GrapharySysOrgService sysOrgService;

    private GrapharySysOrgService sysOrgService2;

    /**
     * 这是多行注释
     *
     * @param qo
     * @return
     */
    @ApiOperation(value = "分页查询组织信息")
    @PostMapping(value = "/findPage")
    public PageResponse<SysOrgVo> findPage(
            @ApiParam(value = "请求参数", required = true) @RequestBody @Valid SysOrgPageQo qo) {
        //这是方法内注释
        return sysOrgService.findPage(qo);
    }

    @ApiOperation(value = "分页查询组织信息")
    @PostMapping(value = "/findPage")
    public PageResponse<SysOrgVo> findPage2(
            @ApiParam(value = "请求参数", required = true) @RequestBody @Valid SysOrgPageQo qo) {
        //这是方法内注释
        return sysOrgService.findPage(qo);
    }
}
