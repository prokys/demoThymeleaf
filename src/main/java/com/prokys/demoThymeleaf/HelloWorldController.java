package com.prokys.demoThymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    // create controller method to show initial html form
    @RequestMapping("/showForm")
    public String showFrom(){
        return "helloworld-form";
    }

    // create controller to process the html form
    @GetMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }
}
