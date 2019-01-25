package com.springboot.web.application.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {    
    @RequestMapping("/welcome")
    public String loginMessage(){
    	System.out.println("In Welcome Controller");
        return "welcome";
    }
}
