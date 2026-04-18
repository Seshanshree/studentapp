package com.college.studentapp.controller;

import com.college.studentapp.model.Student;
import com.college.studentapp.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("student", new Student());
        return "form";
    }

    @PostMapping("/submit")
    public String submitForm(
            @Valid @ModelAttribute("student") Student student,
            BindingResult result) {

        if (result.hasErrors()) {
            return "form";
        }
        studentService.saveStudent(student);
        return "success";
    }
}