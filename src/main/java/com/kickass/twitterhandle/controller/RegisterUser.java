package com.kickass.twitterhandle.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class RegisterUser {

    @PostMapping("/addUsers")
    public boolean addUsers(@RequestParam(value = "name", defaultValue = "World") String name) {
        System.out.println("Adding user ...");
        return true;
    }

    @GetMapping("/listUsers")
    public String listUsers() {
        System.out.println("Listing user ...");
        return "test";
    }

}

