package com.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.entity.Courses;
import com.springrest.service.CourseService;

@RestController
public class MyController
{

	@Autowired
	private CourseService service;
	
	@GetMapping("/home")
	public String home()
	{
		return "Welcome to the courses application";
	}
	@GetMapping("/courses")
	public List<Courses> getAllCourse()
	{
		return this.service.getAllCourse();
	}
	
	@PostMapping("/addcourses")
	public Courses addCourse(@RequestBody Courses courses)
	{
		return this.service.addCourse(courses);
	}
	
	@GetMapping("/courses/{id}")
	public Courses getCourse(@PathVariable Long id)
	{
		return this.service.getCourse(id);
	}
	
	@PutMapping("/edit")
	public Courses editCourse(@RequestBody Courses courses)
	{
		return this.service.editCourse(courses);
		
	}
	@DeleteMapping("/delete/{id}")
	public String deleteCourse(@PathVariable Long id)
	{
		return this.service.deleteCourse(id);
	}
	
}

