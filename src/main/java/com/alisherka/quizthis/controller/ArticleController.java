package com.alisherka.quizthis.controller;

import com.alisherka.quizthis.dto.ArticleForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {

    @GetMapping("/article/form")
    public String newArticleForm(){
        return "articles/new";
    }

    @PostMapping("/create")
    public String createArticle(ArticleForm form){
        System.out.println(form.toString());
        return "";
    }
}
