package com.wldrmnd.incubator.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignInController {

    @GetMapping("/sign-in")
    public String signInPage(Model model) {
        return "sign-in";
    }

    @GetMapping("/timetable")
    @PreAuthorize("hasAuthority('developers:read')")
    public String timetable(Model model) {
        return "timetable";
    }

    @GetMapping("/materials")
    @PreAuthorize("hasAuthority('developers:read')")
    public String materials() {
        return "course-materials";
    }
}
