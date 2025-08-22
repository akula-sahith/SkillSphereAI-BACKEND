package com.MinTrio.SkillSphereAI.controller;

import com.MinTrio.SkillSphereAI.model.Student;
import com.MinTrio.SkillSphereAI.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentController {
    private StudentService studentService;

    @GetMapping("/")
    public String home(){
        return "Hello World";
    }

    @GetMapping("/addStudent")
    public void addStudent(@PathVariable Student student){
        studentService.addStudent(student);
    }
}
