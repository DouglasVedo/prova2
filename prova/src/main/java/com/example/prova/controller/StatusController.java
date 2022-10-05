package com.example.prova.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @GetMapping(path = "/prova/status")
    public String status(){
        return "Online";
    }
}
