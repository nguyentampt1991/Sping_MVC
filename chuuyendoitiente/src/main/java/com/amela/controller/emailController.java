package com.amela.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class emailController {
    @RequestMapping("")
    public String email(){
        return "";
    }

}
