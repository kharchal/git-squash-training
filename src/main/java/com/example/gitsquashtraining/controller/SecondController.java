package com.example.gitsquashtraining.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("second")
public class SecondController {

    @GetMapping("")
    public String second(Model model) {
        model.addAttribute("list", new ArrayList<String>(){{
            add("string");
            add("float");
            add("int");
            add("short");
            add("boolean");
        }});
        return "second";
    }
}
