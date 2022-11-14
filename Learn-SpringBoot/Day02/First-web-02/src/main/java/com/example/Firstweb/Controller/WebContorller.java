package com.example.Firstweb.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //
public class WebContorller {
    // path: /api/helloworld => helloworld
    @GetMapping("/api/helloworld")
    public String getHello(){
        return "helloWorld";
    }
}
