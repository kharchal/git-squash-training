package com.example.gitsquashtraining.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
@RequestMapping("")
public class IndexController {

    @GetMapping("")
    public String index(Model model) {
        model.addAttribute("time", LocalDateTime.now());
        return "index";
    }
}