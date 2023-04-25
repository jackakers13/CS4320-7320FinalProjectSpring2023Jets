package com.jackakers13.cs7320backend.controllers;

import com.jackakers13.cs7320backend.messages.LoginMessage;
import com.jackakers13.cs7320backend.messages.SignUpMessage;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @GetMapping("/")
    public void root(HttpServletResponse response) {
        response.setHeader("Location", "/login");
        response.setStatus(302);
    }

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("login", new LoginMessage());
        return "login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute LoginMessage message, Model model) {
        model.addAttribute("message", message);
        return "home";
    }

    @PostMapping("/signup")
    public String signup(@ModelAttribute SignUpMessage message, Model model) {
        model.addAttribute("message", message);
        return "login";
    }

}
