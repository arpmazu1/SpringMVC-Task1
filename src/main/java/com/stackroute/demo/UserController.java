package com.stackroute.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
    public class UserController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }
        @RequestMapping(value = "/userdetails", method= RequestMethod.POST )
        public String display(@RequestParam("name") String name, @RequestParam("pass") String pass, Model m) {


            User user = new User();
            user.setName(name);
            user.setPass(pass);
            m.addAttribute("name",user.getName());

            return "viewpage";
        }
    }
