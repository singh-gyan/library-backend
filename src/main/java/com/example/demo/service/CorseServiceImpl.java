package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.courses;
@Service
public class CorseServiceImpl implements CourseService {
	List<courses> list;
	public CorseServiceImpl() {
		list = new ArrayList<>();
		list.add(new courses(1,"Networking basics for all","Networking"));
		list.add(new courses(2,"System design overview","System Design"));
		
	}
	@Override
	public List<courses> getCourse() {
		return list;
	}
	@Override
	public courses getCoursebyId(long id) {
		courses c = null;
		for(courses course:list) {
			if(course.getId()==id) {
				c=course;
			}
		}
		return c;
	}
	@Override
	public String addCourse(courses course) {
		list.add(course);
		return "Course Added Successfully";
	}
	@Override
	public courses updateCoursebyId(courses course) {
		for(courses c:list) {
			if(c.getId()==course.getId()) {
				c.setDescription(course.getDescription());
				c.setTitle(course.getTitle());
			}
		}
		return course;
	}
	@Override
	public courses deleteCourse(long id) {
		courses course=null;
		for(courses c:list) {
			if(c.getId()==id)
			{
				course=c;
				list.removeIf(co->co.getId()==id);
			}
		}
		return course;
	}

}
