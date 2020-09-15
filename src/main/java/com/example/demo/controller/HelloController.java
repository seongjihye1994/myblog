package com.example.demo.controller;

import org.springframework.stereotype.Controller; // 컨트롤러 임포트
import org.springframework.web.bind.annotation.GetMapping; // 겟메핑 임포트

@Controller // 컨트롤러 선언
public class HelloController { // 자바 클래스

    @GetMapping("/") // /는 최상위 디렉터리(localhost:8080) 즉, locoahost:8080 url을 요청하면 아래의 helloworld 페이지를 찾아 리턴한다.
    public String hello() {
        return "helloworld";
    } // 헬로월드 페이지를 resources 에서 찾아 반환

    @GetMapping("/greetings")
    public String greetings() {
        return "greetings";
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "welcome";
    }

    @GetMapping("/helloSpringBoot")
    public String SpringBoot() {
        return "helloSpringBoot";
    }

    @GetMapping("/articles")
    public String articles() {
        return "articles";
    }



}
