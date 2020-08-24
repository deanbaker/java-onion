package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public class AppServiceImpl implements AppService {

    @Override
    public String operation() {
        return "foobar";
    }
}
