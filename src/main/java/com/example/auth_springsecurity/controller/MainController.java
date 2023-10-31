package com.example.auth_springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/home")
    public String home(){
        return "Здарова ебать";
    }
    @GetMapping("/user")
    public String user(){
        return "Здарова хуйло";
    }
    @GetMapping("/admin")
    public String admin(){
        return "Здравствуйте";
    }
}
