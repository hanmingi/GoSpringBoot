package com.GoSpringBoot.Starter.Ctl;

import com.GoSpringBoot.Starter.Vo.ItemVo;
import com.GoSpringBoot.Starter.Vo.ResponseVo;
import io.swagger.v3.oas.annotations.Hidden;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/start")
    public String getStart(@RequestParam("name") String name)
    {
        log.info("name => {}", name);
        return "OK";
    }

    @GetMapping("/start2/{name}")
    public String getStart2(@PathVariable("name") String name)
    {
        log.info("name ==> {}", name);
        return "OK";
    }

    @PostMapping("/item")
    public ResponseVo addName(@RequestBody ItemVo item)
    {
        log.info("name : {}", item);

        // option + cmd + v : 변수로 해당 객체 추출
        ResponseVo responseVo = new ResponseVo();

        responseVo.setMessage("ok");

        return responseVo;
    }

}
