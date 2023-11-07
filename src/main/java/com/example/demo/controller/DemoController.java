package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


    @RequestMapping(method = RequestMethod.GET , value = "/demo")
    public String demo(){
        return "demo";
    }
    @RequestMapping(method = RequestMethod.GET , value = "/demo2")
    public String demo2(){
        return "demo222222222";
    }
}
