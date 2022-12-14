package com.alisherka.quizthis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {
    // get request link
    @GetMapping("/")
    public String yourName(Model model){
        model.addAttribute("username", "Alisherka");
        return "greetings"; // templates/greetings.mustache -> 브라우저로 전송
    }

    @GetMapping("/bye")
    public String byeBye(Model model){
        model.addAttribute("username", "Ali");
        return "goodbye";
    }

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }



}
