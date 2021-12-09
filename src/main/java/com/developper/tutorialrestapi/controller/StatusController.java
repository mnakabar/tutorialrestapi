package com.developper.tutorialrestapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/pessoa")
public class StatusController {

    @GetMapping (path = "/api/status")
    public String ckeck(){
        return "Estou on line";
    }
}
