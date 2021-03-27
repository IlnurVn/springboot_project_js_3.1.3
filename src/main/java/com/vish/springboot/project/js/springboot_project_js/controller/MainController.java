package com.vish.springboot.project.js.springboot_project_js.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String getLoginPage() {
        return "login";
    }

    @GetMapping(value = "/admin")
    public String getAdminPage() {
        return "admin";
    }

    @GetMapping(value = "/user")
    public String getUserPage() {
        return "user";
    }
}
