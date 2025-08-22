package com.MinTrio.SkillSphereAI.model;


import org.springframework.context.annotation.Bean;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Document(collection = "Students")
public class Student {
    @Id
    private String name;
    private String email;
    private List<String> skills;
    private List<Integer> course_ids;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public List<Integer> getCourse_ids() {
        return course_ids;
    }

    public void setCourse_ids(List<Integer> course_ids) {
        this.course_ids = course_ids;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
