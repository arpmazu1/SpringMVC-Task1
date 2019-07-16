package com.stackroute.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
    public class UserController {
        @RequestMapping(value = "/",method = RequestMethod.GET)
        public String redirect(Model m) {
            User user = new User();
            user.setMessage("Welcome to Stackroute.");
            m.addAttribute("message",user.getMessage());

            return "index";
        }
    }
