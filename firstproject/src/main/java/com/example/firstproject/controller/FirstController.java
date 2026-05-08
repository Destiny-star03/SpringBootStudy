package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model; //Model 클래스 패키지 자동 임포트
@Controller
public class FirstController {
    @GetMapping("hi")
    public String niceToMeetYou(Model model) {
        //model 객체가 "홍팍" 값을 "username"에 연결해 웹 브라우저로 보냄
        model.addAttribute("username","YongTak");  //"용탁"에서 -> "YongTak"으로 변경
        return "greetings"; //greetings.mustache 파일 반환
    }

    @GetMapping("bye")
    public String seeYouNext(Model model){
        model.addAttribute("nickname","최용탁");
        return "goodbye";
    }


}
