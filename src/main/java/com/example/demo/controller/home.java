package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.courses;
import com.example.demo.service.CourseService;

@RestController
public class home {
	@Autowired
	private CourseService courseService;
	@GetMapping("/courses")
	public List hello() {
		return this.courseService.getCourse();
	}
	@GetMapping("/courses/{id}")
	public courses getCourse(@PathVariable String id) {
		return this.courseService.getCoursebyId(Long.parseLong(id));
	}
	@PostMapping("/courses")
	public String addCourse(@RequestBody courses course) {
		return this.courseService.addCourse(course);
	}
	@PutMapping("/courses")
	public courses updateCourse(@RequestBody courses course) {
		return this.courseService.updateCoursebyId(course);
	}
	@DeleteMapping("/courses/{id}")
	public courses deleteCourse(@PathVariable String id) {
		return this.courseService.deleteCourse(Long.parseLong(id));
	}
}
