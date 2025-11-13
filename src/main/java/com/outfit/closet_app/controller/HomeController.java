package com.outfit.closet_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index() {
        // Esto devuelve el archivo src/main/resources/templates/index.html
        return "index";
    }
}
