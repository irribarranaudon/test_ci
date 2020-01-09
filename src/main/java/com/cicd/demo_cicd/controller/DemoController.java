package com.cicd.demo_cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


    @GetMapping(value = "/holaMundo")
    public String getHola(){
        return "Hola a todo el mundoooo!!";
    }
}
