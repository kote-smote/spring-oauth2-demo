package com.martin.springoauth2demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;

@Controller
public class LandingController {

    @GetMapping
    public String showHome() {
        return "index";
    }

    @GetMapping("login")
    public String showLogin() {
        return "login";
    }

    @GetMapping("me")
    public String showMe(Principal principal, Model model) {
        model.addAttribute("principle", principal);
        return "me";
    }

    @GetMapping("user")
    @ResponseBody
    public Principal getUser(Principal principal) {
        return principal;
    }

}
