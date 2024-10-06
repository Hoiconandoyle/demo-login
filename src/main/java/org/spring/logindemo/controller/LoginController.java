package org.spring.logindemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @GetMapping("/login") // URL http://localhost:8080/login
    public String login() {
        return "login"; // ánh xạ yêu cầu http và chuyển hướng user tới login.html
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @GetMapping("/account")
    public String account(@RequestParam(name = "userName")String username, Model model ) {
        model.addAttribute("userName", username);
        return "account";
    }
}
