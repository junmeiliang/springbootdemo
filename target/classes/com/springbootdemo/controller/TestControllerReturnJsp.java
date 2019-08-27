package com.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestControllerReturnJsp {

    @GetMapping("/testJsp")
    public String test(Model model){

        model.addAttribute("msc","this is a test jsp.");
        return "index";
    }
}
