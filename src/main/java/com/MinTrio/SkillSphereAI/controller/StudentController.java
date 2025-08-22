package com.MinTrio.SkillSphereAI.controller;

import com.MinTrio.SkillSphereAI.model.Student;
import com.MinTrio.SkillSphereAI.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    public String home(){
        return "Hello World";
    }

    @PostMapping("/addStudent")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }
}
