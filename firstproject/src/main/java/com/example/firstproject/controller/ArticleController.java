package com.example.firstproject.controller;

import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entity.Article;
import com.example.firstproject.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {

    // @Autowired : new로 객체를 생성하지 않아도 스프링 부트가 알아서 객체 만들고 주입해 준다
    // 컨트롤러의 필드에 붙이면 된다
    // DI (의존성 주입) Dependency Injection
    @Autowired
    private ArticleRepository articleRepository;

    @GetMapping("/articles/new")
    public String newArticleForm() {
        return "articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form) { // DTO 형태로 form 데이터를 받아온다

        // 받아온 데이터를 출력, 잘 담겼는지 확인
        // dto 출력
        System.out.println(form.toString());

        // 1. DTO를 엔티티로 변환
        Article article = form.toEntity();
        // 엔티티 출력
        System.out.println(article.toString());

        // 2. 리파지터리로 엔티티를 DB에 저장
        Article saved = articleRepository.save(article);
        // DB에 저장된 값 출력
        System.out.println(saved.toString());
        return "";
    }
}