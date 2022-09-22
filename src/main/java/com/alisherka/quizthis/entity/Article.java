package com.alisherka.quizthis.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity // DB가 해당 객체를 인식 가능
@AllArgsConstructor
@ToString
@NoArgsConstructor // Default 생성자를 추가해주는 Annotation
@Getter
public class Article {
    @Id
    @GeneratedValue // 1,2,3,4.... 자동 생성 annotation
    private Long id;

    @Column
    private String title;
    @Column
    private String content;
}
