package com.example.basiclogin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/test1")
    public String test1(){
        return "test1 - all";
    }
    @GetMapping("/test2")
    public String test2(){
        return "test2 - user";
    }
    @GetMapping("/test3")
    public String test3(){
        return "test3 - admin";
    }
}
