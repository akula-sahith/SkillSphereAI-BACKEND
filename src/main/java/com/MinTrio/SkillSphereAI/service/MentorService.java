package com.MinTrio.SkillSphereAI.service;

import com.MinTrio.SkillSphereAI.model.Mentor;
import com.MinTrio.SkillSphereAI.repositry.MentorRepositry;
import org.springframework.beans.factory.annotation.Autowired;

public class MentorService {

    @Autowired
    private MentorRepositry mentorRepositry;

    public void addMentor(Mentor mentor){
        mentorRepositry.save(mentor);
    }
}
