package com.example.firstproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity // 엔티티 선언, 클래스 이름으로(Article) "테이블"이 만들어진다.
public class Article {

    // id가 붙으면 키로 사용될 컬럼이다.
    // GeneratedValue는 id값을 자동으로 생성해준다. ex) 1, 2, 3.....
    @Id
    @GeneratedValue
    private Long id;
    // Column 이름으로 컬럼이 만들어진다.
    @Column
    private String title;
    @Column
    private String content;

    public Article(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
