insert into article(id, title, content) values(1, '111', '111');
insert into article(id, title, content) values(2, '222', '222');
insert into article(id, title, content) values(3, '333', '333');

-- article 더미 데이터
insert into article(id, title, content) values(4, 'cccc', 'cccc1');
insert into article(id, title, content) values(5, 'cccc222', 'cccc2');
insert into article(id, title, content) values(6, 'cccc333', 'cccc3');

-- comment 더미 데이터
insert into comment(id, article_id, nickname, body) values(1, 4, 'fc1', 'cc1');
insert into comment(id, article_id, nickname, body) values(2, 4, 'fc2', 'cc2');
insert into comment(id, article_id, nickname, body) values(3, 4, 'fc3', 'cc3');

-- 5번 게시글의 댓글들
insert into comment(id, article_id, nickname, body) values(4, 5, 'fc1', 'cc1');
insert into comment(id, article_id, nickname, body) values(5, 5, 'fc2', 'cc2');
insert into comment(id, article_id, nickname, body) values(6, 5, 'fc3', 'cc3');

-- 6번 게시글의 댓글들
insert into comment(id, article_id, nickname, body) values(7, 6, 'fc1', 'cc1');
insert into comment(id, article_id, nickname, body) values(8, 6, 'fc2', 'cc2');
insert into comment(id, article_id, nickname, body) values(9, 6, 'fc3', 'cc3');

