package com.amela.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.amela.server.translatesever;

@Controller
public class translatecontroller {
@RequestMapping("/translate-form")
    public String translate(){
    return "translate";
}
private translatesever translatesever = new translatesever();
@PostMapping("/translate-result")
    public ModelAndView result(@RequestParam String name){
    String result = translatesever.translate(name);
    ModelAndView modelAndView = new ModelAndView("translate","translate-result",result);
    return modelAndView;
}
}
