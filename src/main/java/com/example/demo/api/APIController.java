package com.example.demo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {

    private final Delegate delegate;

    public APIController(Delegate delegate) {
        this.delegate = delegate;
    }


    @GetMapping("/operation")
    public String operation(@RequestParam String userId) {

        return delegate.go(userId);
    }
}
