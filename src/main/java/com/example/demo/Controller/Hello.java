package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class Hello {

    @GetMapping("/test")
    public String hello(){
        System.out.println("++++++++++++++++++++++++++");
        return "hi vipi!";
    }
}

