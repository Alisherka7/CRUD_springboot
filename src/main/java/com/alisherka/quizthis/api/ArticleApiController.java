package com.alisherka.quizthis.api;

import com.alisherka.quizthis.dto.ArticleForm;
import com.alisherka.quizthis.entity.Article;
import com.alisherka.quizthis.repository.ArticleRepository;
import com.alisherka.quizthis.service.ArticleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController // RestAPI용 컨트롤러! 데이터(JSON)를 반환
public class ArticleApiController {
    @Autowired // Dependency Injection  -> 생성 객체를 가져와 연결
    private ArticleService articleService;

    // get
    @GetMapping("/api/articles")
    public List<Article> index(){
        return articleService.index();
    }
    @GetMapping("/api/articles/{id}")
    public Article index(@PathVariable Long id){
        return articleService.show(id);
    }
//
//    // post
//    @PostMapping("/api/articles")
//    public Article create(@RequestBody ArticleForm dto){
//        Article article = dto.toEntity();
//        return articleRepository.save(article);
//    }
//
//    // patch
//    @PatchMapping("/api/articles/{id}")
//    public ResponseEntity<Article> update(@PathVariable Long id, @RequestBody ArticleForm dto){
//        // 1 수정용 엔티티 생성
//        Article article = dto.toEntity();
//        log.info("Id: {}, article: {}", id, article.toString());
//
//        // 2 대상 엔티티를 조회
//        Article target = articleRepository.findById(id).orElse(null);
//
//        // 3 잘못된 요청 처리( 대상이 없거나, id가 다른 경우)
//        if(target == null || id != article.getId()){
//            // 400 잘못된 요청 용답
//            log.info("잘못된 요청!: id{}, article: {}", id, article.toString());
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
//        }
//        // 4 업데이트 및 정상 용답(200)
//        target.patch(article);
//        Article updated = articleRepository.save(target);
//        return ResponseEntity.status(HttpStatus.OK).body(updated);
//    }
//
//    // delete
//    @DeleteMapping("/api/articles/{id}")
//    public ResponseEntity<Article> delete(@PathVariable Long id){
//        // 대상 찿기
//        Article target = articleRepository.findById(id).orElse(null);
//        // 대상 처리
//        if(target == null){
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
//        }
//
//        // 대상 삭제
//        articleRepository.delete(target);
//        // 대상 반환
//        return ResponseEntity.status(HttpStatus.OK).build();
//    }
}
