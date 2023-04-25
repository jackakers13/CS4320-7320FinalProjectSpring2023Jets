package com.jackakers13.cs7320backend.controllers;

import com.jackakers13.cs7320backend.messages.EditProfileMessage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EditProfileController {

    @GetMapping("/editprofile")
    public String login(Model model) {
        model.addAttribute("login", new EditProfileMessage());
        return "editprofile";
    }

    @PostMapping("/editprofile")
    public String login(@ModelAttribute EditProfileMessage message, Model model) {
        model.addAttribute("message", message);
        return "home";
    }

}
