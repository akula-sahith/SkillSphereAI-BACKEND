package com.MinTrio.SkillSphereAI;

import com.MinTrio.SkillSphereAI.model.Student;
import com.MinTrio.SkillSphereAI.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SkillSphereAiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SkillSphereAiApplication.class, args);
//		Student student =  context.getBean(Student.class);
//		student.setName("Sahith");
//		student.setEmail("akulasahith268@gmail.com");
//		List<String> skills = Arrays.asList("Java","Python");
//		student.setSkills(skills);
//		List<Integer> cids = Arrays.asList(1,2,3);
//		student.setCourse_ids(cids);
//		StudentService service = context.getBean(StudentService.class);
//		service.addStudent(student);
	}

}
