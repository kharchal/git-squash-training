package com.example.gitsquashtraining.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
@RequestMapping("")
@Slf4j
public class IndexController {

    @GetMapping("")
    public String index(Model model) {
        log.info("GET / invoked");
        model.addAttribute("time", LocalDateTime.now());
        return "index";
    }
}
