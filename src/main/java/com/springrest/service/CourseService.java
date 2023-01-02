package com.springrest.service;

import java.util.List;

import com.springrest.entity.Courses;

public interface CourseService 
{

	public List<Courses> getAllCourse();

	public Courses addCourse(Courses course);

	public Courses getCourse(Long id);

	public Courses editCourse(Courses course);

	public String deleteCourse(Long id);
}
