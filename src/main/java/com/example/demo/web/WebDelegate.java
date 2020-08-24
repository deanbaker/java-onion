package com.example.demo.web;

import com.example.demo.services.MyService;
import org.springframework.stereotype.Component;

@Component
public class WebDelegate {

    private final MyService myService;

    public WebDelegate(MyService myService) {
        this.myService = myService;
    }

    public String go(String userId) {

        String result = myService.operation(userId);

        if (result == null) {
            result = "Unauthorized";
        }

        return result;
    }
}
