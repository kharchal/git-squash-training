package com.example.gitsquashtraining.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("second")
@Slf4j
public class SecondController {

    @GetMapping("")
    public String second(Model model) {
        log.info("GET /second invoked");
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
