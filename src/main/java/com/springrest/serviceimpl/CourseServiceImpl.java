package com.springrest.serviceimpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.dao.CoursesDao;
import com.springrest.entity.Courses;
import com.springrest.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService
{
	@Autowired
	private CoursesDao dao;

	public List<Courses> getAllCourse() {
		return (List<Courses>) dao.findAll();
	}

	public Courses addCourse(Courses course) {
		
		dao.save(course);
		return course;
	}
	public Courses getCourse(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}
	@Override
	public Courses editCourse(Courses course) {
		
		dao.save(course);
		return course;
	}
	@Override
	public String deleteCourse(Long id) {
		
		dao.deleteById(id);	
		return"deleted";
	}
	
	

}
