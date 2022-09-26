package com.alisherka.quizthis.service;

import com.alisherka.quizthis.dto.ArticleForm;
import com.alisherka.quizthis.entity.Article;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest // 해당 클래스는 스프링부트와 연동되어 테스팅된다
class ArticleServiceTest {

    @Autowired ArticleService articleService;

    @Test
    void index() {
        // 예상
        Article a = new Article(1L, "111", "111");
        Article b = new Article(2L, "222", "222");
        Article c = new Article(3L, "333", "333");
        List<Article> expected = new ArrayList<Article>(Arrays.asList(a,b,c));

        // 실제
        List<Article> articles = articleService.index();

        // 비교
        assertEquals(expected.toString(), articles.toString());
    }

    @Test
    void show_성공__존재하는_id_입력() {
        // 예상
        Long id = 1L;
        Article expected = new Article(id, "111", "111");

        // 실제
        Article article = articleService.show(id);

        // 비교
        assertEquals(expected.toString(), article.toString());
    }

    @Test
    void show_실패() {
        // 예상
        Long id = -1L;
        Article expected = null;

        // 실제
        Article article = articleService.show(id);

        // 비교
        assertEquals(expected, article);
    }

    @Test
    @Transactional
    void create_성공__Title과_content만_있는_dto_입력() {
        // 예상
        String title = "111";
        String content = "111";
        ArticleForm dto = new ArticleForm(null, title, content);
        Article expected = new Article(4L, title, content);

        // 실제
        Article article = articleService.create(dto);

        // 비교
        assertEquals(expected.toString(), article.toString());

    }

    @Test
    @Transactional
    void create_실패__id과_포함된_dto_입력() {
        // 예상
        String title = "111";
        String content = "111";
        ArticleForm dto = new ArticleForm(4L, title, content);
        Article expected = null;

        // 실제
        Article article = articleService.create(dto);

        // 비교
        assertEquals(expected, article);
    }

    @Test
    @Transactional
    void update_성곡___존재하는_id는_title만_있는_dto_입력(){

    }

    @Test
    @Transactional
    void update_실패__id만_있는_dto_입력(){

    }

    @Test
    @Transactional
    void update_실패___존재하는_id만_있는_입력(){

    }
}

