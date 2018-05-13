package com.pailie.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String hello(@RequestParam(value = "name",defaultValue = "world") String username, Model model){
        model.addAttribute("message","Hello from the controller");
        model.addAttribute("message2","welcome"+username);
        System.out.println("ddd");
        return "resulePage1";
    }
}
