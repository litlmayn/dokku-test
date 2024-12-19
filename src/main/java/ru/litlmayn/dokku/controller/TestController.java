package ru.litlmayn.dokku.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hello")
    public String startPage() {
        return "Hello world!!!";
    }
}