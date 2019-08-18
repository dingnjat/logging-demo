package ding.nyat.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @Value("${test.value}")
    private String value;

    @GetMapping("/")
    public String home() {
        System.out.println(value);
        return "index";
    }
}
