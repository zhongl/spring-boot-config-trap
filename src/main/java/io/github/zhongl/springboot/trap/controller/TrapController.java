package io.github.zhongl.springboot.trap.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrapController {

    @Value("${trap.key}") String key;

    @RequestMapping("/")
    public String key() {
        return key;
    }
}
