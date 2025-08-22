package com.MinTrio.SkillSphereAI.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Component
@Document
public class Course {
    private Integer cid;
    private String cname;

}
