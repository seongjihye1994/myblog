package com.example.demo.dto; // 뷰페이지에서 데이터를 컨트롤러에 가져오는 객체

import com.example.demo.entity.Article;

public class ArticleForm {
    private String title;
    private String content;
    private String name;

    public ArticleForm(String title, String content, String name) {
        this.title = title;
        this.content = content;
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getName() {
        return name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDate(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ArticleForm{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", name=" + name +
                '}';
    }

    // entity 객체의 생성자를 호출해주는 메소드
    public Article toEntity() {
        return new Article(name, title, content); // Article 생성자를 호출하는 메서드를 리턴
    }
}
