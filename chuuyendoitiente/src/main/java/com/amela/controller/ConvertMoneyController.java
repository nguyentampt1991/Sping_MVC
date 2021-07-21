package com.amela.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConvertMoneyController {
    @GetMapping("/convert-money-form")
    public String convertMoney()
    {
        return "convert-money";
    }
    @PostMapping("/convert-money-result")
    public ModelAndView convertMoneyResult(@RequestParam String rate, @RequestParam String usd)
    {
        int rate_ = Integer.parseInt(rate);
        int usd_ = Integer.parseInt(usd);
        int result = rate_*usd_;

        ModelAndView modelAndView = new ModelAndView("convert-money-result","convert-result", result);

        return modelAndView;
    }


}