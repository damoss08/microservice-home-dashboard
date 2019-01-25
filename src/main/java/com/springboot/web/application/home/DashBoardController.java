package com.springboot.web.application.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DashBoardController {
    @RequestMapping("/dashboard")
    public String dashboard(){
    	System.out.println("Inthe Dashboard Controller");
        return "dashboard";
    }
}
