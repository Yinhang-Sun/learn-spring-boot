package com.yinhang.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses() {
		return Arrays.asList(
				new Course(1, "Learn AWS", "Yinhang"), 
				new Course(2, "Learn DevOps", "Yinhang"), 
				new Course(3, "Learn Azure", "Yinhang"), 
				new Course(4, "Learn GCP", "Yinhang")
				
				);
	}

}
