package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping({"/sandwich"})
public class SandwichController {
    @GetMapping("/home")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("/sandwich/home");
        return modelAndView;
    }

    @GetMapping("/save")
    public ModelAndView save(@RequestParam(value = "condiment") String condiment) {
        ModelAndView modelAndView = new ModelAndView("/sandwich/home");
        modelAndView.addObject("condiment", condiment);
        return modelAndView;
    }

}
