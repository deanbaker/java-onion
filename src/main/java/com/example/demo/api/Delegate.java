package com.example.demo.api;

//import com.example.demo.services.AppService;
import com.example.demo.services.MyService;
import org.springframework.stereotype.Component;

@Component
public class Delegate {

    private final MyService myService;

    // Try to access AppService...
//    private final AppService appService;


    public Delegate(MyService myService) {
        this.myService = myService;
    }

    public String go(String userId) {

        String result = myService.operation(userId);
        if (result == null) {
            //probably do something a bit nicer here with @ControllerAdvice and better exceptions...
            throw new RuntimeException("Unauthorised!");
        }

        return result;
    }
}
