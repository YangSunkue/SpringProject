package com.example.firstproject.repository;

import com.example.firstproject.entity.Article;
import org.springframework.data.repository.CrudRepository;

// CrudRepository 상속받기, 관리 대상 엔티티 자료형과 id(키) 자료형 입력
public interface ArticleRepository extends CrudRepository<Article, Long> {
}
// 이렇게만 구현하면 CrudRepository 기능을 전부 가져다 쓸 수 있다