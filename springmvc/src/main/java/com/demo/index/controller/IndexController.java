package com.demo.index.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * Created by Fengyun on 5/8/2017.
 */
@Controller
public class IndexController {
    private static final Logger LOG = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping("/index")
    public String index(){
        //model.addAttribute("message", "hello,Index");
        return "index";
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello world";
    }


    @RequestMapping("/test-logback")
    @ResponseBody
    public Date testLogback(){
        LOG.trace("-----------------------------------trace");
        LOG.debug("-----------------------------------debug");
        LOG.info("-----------------------------------info");
        LOG.warn("-----------------------------------warn");
        LOG.error("-----------------------------------error");
        return new Date();
    }
}
