package com.example.springapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
@Slf4j
public class HelloController {
    @GetMapping
    public String hello() {
        log.info("hello. hello");
        return "{\"foo\":\"bar\"}";
    }
}
