package com.MinTrio.SkillSphereAI.repositry;

import com.MinTrio.SkillSphereAI.model.Mentor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MentorRepositry extends MongoRepository<Mentor,String> {
}
