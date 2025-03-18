package com.itconnor.springbootdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HellowController {
    @RequestMapping("/hellow")
    public String hellow() {
        return "hellow";
    }
}
