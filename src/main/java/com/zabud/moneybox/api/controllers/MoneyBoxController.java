package com.zabud.moneybox.api.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MoneyBoxController {

    @GetMapping("/index")
    public String hello(){
        return ("index");
    }
}
