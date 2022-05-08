package com.moremore.web;


import com.moremore.domain.config.auth.LoginUser;
import com.moremore.domain.config.auth.dto.SessionUser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@RequiredArgsConstructor
@Controller
public class IndexController {
    private final HttpSession httpSession;

    @GetMapping("/")
    public String index(Model model, @LoginUser SessionUser user) {

        if(user != null) {
            model.addAttribute("userName", user.getName());

            String role = user.getRoleKey();

            if(role.compareTo("ROLE_GUEST") == 0) model.addAttribute("role", "GUEST");
            else if(role.compareTo("ROLE_USER") == 0) model.addAttribute("role", "USER");
            else model.addAttribute("role", "ANON");
        }
        return "index";
    }
}
