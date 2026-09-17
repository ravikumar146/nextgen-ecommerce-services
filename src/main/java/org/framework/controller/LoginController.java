package org.framework.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @GetMapping("/api/login")
    public String login() {
        return "Login successful";
    }
}
