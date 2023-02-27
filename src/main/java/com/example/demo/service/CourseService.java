package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.courses;

public interface CourseService {
	public List<courses> getCourse();
	public courses getCoursebyId(long id);
	public String addCourse(courses course);
	public courses updateCoursebyId(courses course);
	public courses deleteCourse(long id);
}
