package com.example.demo.controller;

import com.example.demo.dto.ArticleForm;
import com.example.demo.entity.Article;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j //롬북
@Controller
public class ArticleController {

    @GetMapping("/articles")
    public String index(Model model) {
        model.addAttribute("msg", "안녕하세요, 반갑습니다!");
        return "articles/index";
    }

    @GetMapping("/articles/new")
    public String articlesNEw() {
        return "articles/new";
    }

    @PostMapping("/articles")
    public String create(ArticleForm form) {
        log.info(form.toString()); // 터미널에 데이터 출력하기 위한 메소드 호출
        Article entity = form.toEntity(); // 객체를 디비에 저장하기 위한 메소드 호출
        return "redirect:/articles";
    }

}


