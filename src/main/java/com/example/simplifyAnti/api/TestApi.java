package com.example.simplifyAnti.api;

import com.example.simplifyAnti.mapper.TestMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wuwei
 * @createTime 16 22:08
 * @description
 */
@Api(tags = "测试")
@RestController
@RequestMapping("/testApi")
public class TestApi {

    @Resource
    private TestMapper testMapper;

    @ApiOperation("测试接口")
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String testGet(@RequestParam String arg) {
        return testMapper.hello(arg);
    }
}
