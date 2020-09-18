package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // db에 데이터를 저장하기 위해 생성하는 객체
public class Article {

    @Id // Id 생성
    @GeneratedValue (strategy = GenerationType.IDENTITY) // db에서 자동으로 row 고유번호가 증가되게끔 함
    private Long id; // 데이터베이스 테이블에서의 row 고유번호를 저장
    private String name;
    private String title;
    private String content;

    // Entity 객체는 기본 생성자를 생성해야 한다.
    public Article() {
    }

    // Id는 DB에서 자동으로 만들어주기 때문에 직접 생성자를 만들어 줄 필요가 없다.(업데이트 시에는 만들어 줘야함)
    public Article(String name, String title, String content) {
        this.name = name;
        this.title = title;
        this.content = content;
    }

    // Id 게터 세터는 필요 없다.(업데이트 시에는 필요함)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
