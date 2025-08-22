package com.MinTrio.SkillSphereAI.repositry;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.MinTrio.SkillSphereAI.model.Student;

@Repository
public interface StudentRepositry extends MongoRepository<Student,String> {

}
