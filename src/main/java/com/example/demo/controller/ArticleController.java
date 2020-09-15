package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArticleController {

    @GetMapping("/articles")
    public String index(Model model) {
        model.addAttribute("msg", "안녕하세요, 반갑습니다!");
        return "articles/index";
    }

}
