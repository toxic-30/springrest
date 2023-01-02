package com.springrest.dao;
import org.springframework.data.repository.CrudRepository;

import com.springrest.entity.Courses;

public interface CoursesDao extends CrudRepository<Courses, Long> {

}
