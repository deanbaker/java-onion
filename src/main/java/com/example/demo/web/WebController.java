package com.example.demo.web;

import org.apache.logging.log4j.util.Strings;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    private String template = "<html> %s </html>";

    private final WebDelegate delegate;

    public WebController(WebDelegate delegate) {
        this.delegate = delegate;
    }

    @GetMapping("operation.html")
    public String operation(@RequestParam String userId) {

        return String.format(template, delegate.go(userId));
    }
}
