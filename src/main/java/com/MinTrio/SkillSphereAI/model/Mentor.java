package com.MinTrio.SkillSphereAI.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Document(collection = "Mentors")
public class Mentor {
    private String name;
    @Id
    private String email;
    private List<String> skills;
    private List<String> student_emails;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public List<String> getStudent_emails() {
        return student_emails;
    }

    public void setStudent_emails(List<String> student_emails) {
        this.student_emails = student_emails;
    }
}
