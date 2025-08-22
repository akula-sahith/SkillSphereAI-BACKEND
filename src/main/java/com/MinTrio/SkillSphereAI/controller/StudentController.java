package com.MinTrio.SkillSphereAI.controller;

import com.MinTrio.SkillSphereAI.model.Student;
import com.MinTrio.SkillSphereAI.service.StudentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class StudentController {
    private StudentService studentService;

    @GetMapping("/")
    public String home(){
        return "Hello World";
    }

    @PostMapping("/addStudent")
    public void addStudent(@PathVariable Student student){
        studentService.addStudent(student);
    }
}
