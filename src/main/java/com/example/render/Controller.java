package com.example.render;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/nombre")
    public String getName() {
        return "Cristopher";
    }
}
