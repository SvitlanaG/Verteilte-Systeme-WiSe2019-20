package com.example.demo.web;

import com.example.demo.web.model.User;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @Value("${custom.welcome.message}")
    private String customeWelcomeMessage;

    @RequestMapping("hello")
    public String welcomeMessage() { return customeWelcomeMessage;}

    @GetMapping("/user/u")
    public User getUserU() {
        return new User("Anna");
    }

    @GetMapping("/user/s")
    public String getUserS() {
        final User u = new User("Sam");
        return u.toString();
    }
}
