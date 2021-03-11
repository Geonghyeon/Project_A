package com.yeonghun.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/main/test.do")
    public String TestMethode() throws Exception {

        return "test";
    }
}
