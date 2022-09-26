package com.alisherka.quizthis.repository;

import com.alisherka.quizthis.entity.Article;
import com.alisherka.quizthis.entity.Comment;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest // JPA와 연동한 테스트
class CommentRepositoryTest {

    @Autowired CommentRepository commentRepository;
    @Test
    @DisplayName("특정 게시글의 모든 댓글 조회")
    void findByArticleId() {
        /* Case1: 4번 게시글의 모든 댓글 조회 */
        {
            // 입력 데이터 준비
            Long articleId = 4L;


            // 실제 수행
            List<Comment> comments = commentRepository.findByArticleId(articleId);

            // 예상하기
            Article article = new Article(4L, "cccc", "cccc1");
            Comment a = new Comment(1L, article, "fc1", "cc1");
            Comment b = new Comment(2L, article, "fc2", "cc2");
            Comment c = new Comment(3L, article, "fc3", "cc3");
            List<Comment> expected = Arrays.asList(a, b, c);

            // 검증
            assertEquals(expected.toString(), comments.toString(), "4번 글의 모든 댓글을 출력!");
        }
        /* Case2: 1번 게시글의 모든 댓글 조회 */
        {
            // 입력 데이터 준비
            Long articleId = 1L;


            // 실제 수행
            List<Comment> comments = commentRepository.findByArticleId(articleId);

            // 예상하기
            Article article = new Article(1L, "111", "111");
            List<Comment> expected = Arrays.asList();

            // 검증
            assertEquals(expected.toString(), comments.toString(), "1번 글은 댓글이 없음!");
        }
        /* Case3: 9번 게시글의 모든 댓글 조회 */
        {
            // 입력 데이터 준비
            Long articleId = 1L;


            // 실제 수행
            List<Comment> comments = commentRepository.findByArticleId(articleId);

            // 예상하기
            Article article = new Article(1L, "111", "111");
            List<Comment> expected = Arrays.asList();

            // 검증
            assertEquals(expected.toString(), comments.toString(), "1번 글은 댓글이 없음!");
        }

        /* Case4: 9999번 게시글의 모든 댓글 조회 */
        {
            // 입력 데이터 준비
            Long articleId = 1L;


            // 실제 수행
            List<Comment> comments = commentRepository.findByArticleId(articleId);

            // 예상하기
            Article article = new Article(1L, "111", "111");
            List<Comment> expected = Arrays.asList();

            // 검증
            assertEquals(expected.toString(), comments.toString(), "1번 글은 댓글이 없음!");
        }

        /* Case5: -1번 게시글의 모든 댓글 조회 */
        {
            // 입력 데이터 준비
            Long articleId = 1L;


            // 실제 수행
            List<Comment> comments = commentRepository.findByArticleId(articleId);

            // 예상하기
            Article article = new Article(1L, "111", "111");
            List<Comment> expected = Arrays.asList();

            // 검증
            assertEquals(expected.toString(), comments.toString(), "1번 글은 댓글이 없음!");
        }

    }

    @Test
    @DisplayName("특정 닉네님의 모든 댓글 조회")
    void findByNickName() {
        /* Case1: "fc1"의 모든 댓글 조회 */
        {
            // 입력 데이트를 준비
            String nickname = "fc1";
            // 실제 수행
            List<Comment> comments = commentRepository.findByNickName(nickname);

            // 예상하기
            Comment a = new Comment(1L, new Article(4L, "cccc", "cccc1"), "fc1", "cc1");
            Comment b = new Comment(4L, new Article(5L, "cccc222", "cccc2"), "fc1", "cc1");
            Comment c = new Comment(7L, new Article(6L, "cccc333", "cccc3"), "fc1", "cc1");
            List<Comment> expected = Arrays.asList(a, b, c);


            // 검증
            assertEquals(expected.toString(), comments.toString(), "fc1의 모든 댓글을 출려!");
        }
    }
}