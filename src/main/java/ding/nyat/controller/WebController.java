package ding.nyat.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    private Logger logger = LogManager.getLogger(WebController.class);

    @GetMapping("/")
    public String home() {
        logger.warn("HOHO");
        return "indexx";
    }
}
