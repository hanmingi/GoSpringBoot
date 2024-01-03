package com.GoSpringBoot.Starter.Ctl;

import io.swagger.v3.oas.annotations.Hidden;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@Slf4j
public class StarterCtl {

    @GetMapping("/temp")
    public String temp()
    {
        return "Give It A Go";
    }

    @GetMapping("/SwaggerTest")
    public String SwaggerTest()
    {
        log.info("lombok log Test");
        return "Test Api";
    }

    @GetMapping("/Hidden")
    @Hidden
    public String Hidden()
    {
        return "Hidden";
    }
}
