package com.GoSpringBoot.Starter.CTL;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StarterCtl {

    @GetMapping("/temp")
    public String temp(){
        return "Give It A Go";
    }
}
