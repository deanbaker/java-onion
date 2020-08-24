package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService {

    private final AppService appService;

    public MyServiceImpl(AppService appService) {
        this.appService = appService;
    }

    @Override
    public String operation(String userId) {
        if (!"allowed".equals(userId)) {
            return null;
        }

        return appService.operation();
    }
}
