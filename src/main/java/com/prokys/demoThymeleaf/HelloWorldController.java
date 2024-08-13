package com.prokys.demoThymeleaf;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    // need a controller to read form data and add data to the model
    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model){

        // read the request parameter from HTML form
        String theName = request.getParameter("studentName");

        // convert the data to all caps
        theName = theName.toUpperCase();

        // create the message
        String result = "Yo! "+theName;

        //add message to model
        model.addAttribute("message", result);

        return "helloworld";

    }
}
