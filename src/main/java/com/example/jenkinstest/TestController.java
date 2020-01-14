package com.example.jenkinstest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/getName")
    public String getName(@RequestParam("name")String name){
        return "your name is :"+name;
    }

    @GetMapping("/getName111")
    public String getName1(@RequestParam("name")String name){
        return "1your name is :"+name;
    }

}
