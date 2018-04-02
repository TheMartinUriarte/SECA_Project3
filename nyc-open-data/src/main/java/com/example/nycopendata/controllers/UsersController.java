package com.example.nycopendata.controllers;

        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.*;

@RestController
public class UsersController {

    @GetMapping("/users")
    public String home() {
        return "some users";
    }
}