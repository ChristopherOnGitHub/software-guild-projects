package com.tsguild.basicsecurityproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
        
    public MainController() {
    }
    
    @RequestMapping(value={"/", "/home"})
    public String displayMain(){
        return "main";
    }
    
    @ResponseBody
    @RequestMapping(value="/adminOnly")
    public String adminOnly(){
        return "Hey there admin!!";
    }
    
    @ResponseBody
    @RequestMapping(value = "/userOnly")
    public String userOnly() {
        return "Hey there user!";
    }
    
    @ResponseBody
    @RequestMapping(value = "/adminOrUser")
    public String adminAndUserOnly() {
        return "Hey there authenticated person!";
    }

    @ResponseBody
    @RequestMapping(value = "/anyAuthed")
    public String anyUsername() {
        return "Hey there person with a username!";
    }

    @ResponseBody
    @RequestMapping(value = "/anyBody")
    public String allPeople() {
        return "Hey there!";
    }

}
