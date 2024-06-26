package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;

public class ArticleForm {

    private String title;  // 제목을 받을 필드
    private String content;  // 내용을 받을 필드

    // 전송받은 제목과 내용을 필드에 저장하는 생성자
    public ArticleForm(String title, String content) {
        this.title = title;
        this.content = content;
    }

    // 데이터를 잘 받았는지 확인할 toString() 메서드
    @Override
    public String toString() {
        return "ArticleForm{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    // 객체에 id정보는 없으므로 null을 준다
    // GeneratedValue에 의해 id값이 할당될 것이다
    public Article toEntity() {
        return new Article(null, title, content);
    }
}