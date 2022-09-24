package com.alisherka.quizthis.service;

import com.alisherka.quizthis.entity.Article;
import com.alisherka.quizthis.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // 서비 선언! (서비스 객체를 스프링부트에 생성)
public class ArticleService {
    @Autowired // DI
    private ArticleRepository articleRepository;

    public List<Article> index() {
        return articleRepository.findAll();
    }

    public Article show(Long id) {
        return articleRepository.findById(id).orElse(null);
    }
}
