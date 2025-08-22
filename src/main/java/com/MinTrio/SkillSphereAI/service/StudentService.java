package com.MinTrio.SkillSphereAI.service;

import com.MinTrio.SkillSphereAI.model.Student;
import com.MinTrio.SkillSphereAI.repositry.StudentRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentService {

    @Autowired
    private StudentRepositry studentRepositry;

    public void addStudent(Student student){
        studentRepositry.save(student);
    }
}
