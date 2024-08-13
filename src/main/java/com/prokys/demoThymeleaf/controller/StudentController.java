package com.prokys.demoThymeleaf.controller;

import com.prokys.demoThymeleaf.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
    @GetMapping("/showStudentForm")
    public String showForm(Model theModel){
        //create a new student object
        Student theStudent = new Student();

        //add student into model
        theModel.addAttribute("student", theStudent);

        return "student-form";
    }
}
