package com.soft1851.qjcontentcenter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author 小半吻
 */
@RestController
@RequestMapping(value = "/content")
public class ContentHello {
    @GetMapping
    public String getHello(){
        return "hello content-center!";
    }
}
