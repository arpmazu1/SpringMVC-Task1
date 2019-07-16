package com.stackroute.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

    @Controller
    public class UserController {
        @RequestMapping("/click")
        public String redirect(Model m) {
            User user = new User();
            user.setMessage("Welcome to Stackroute.");
            m.addAttribute("message",user.getMessage());

            return "viewpage";
        }
    }
