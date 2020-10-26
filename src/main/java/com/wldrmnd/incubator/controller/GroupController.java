package com.wldrmnd.incubator.controller;

import com.wldrmnd.incubator.model.User;
import com.wldrmnd.incubator.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GroupController {

    private final UserService userService;

    @Autowired
    public GroupController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/group")
    @PreAuthorize("hasAuthority('developers:read')")
    public String group(Model model, @AuthenticationPrincipal UserDetails user) {
        User currentUser = userService.getUserByLogin(user.getUsername());
        model.addAttribute("firstName", currentUser.getFirstName());
        model.addAttribute("lastName", currentUser.getLastName());
        model.addAttribute("direction", currentUser.getDirection());
        return "group";
    }
}
