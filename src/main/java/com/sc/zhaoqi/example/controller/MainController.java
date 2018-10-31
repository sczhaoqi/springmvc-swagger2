package com.sc.zhaoqi.example.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author sczhaoqi
 */
@Controller
public class MainController {

    // 首页
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }
    @GetMapping("/hello")
    @ApiOperation(value = "hello", notes = "hello", httpMethod = "GET")
    @ResponseBody
    public String hello(){
        return "hello";
    }
}