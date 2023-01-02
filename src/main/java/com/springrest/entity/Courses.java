package com.springrest.entity;

import javax.persistence.Entity;

@Entity
public class Courses 
{
	@javax.persistence.Id
	Long Id;
	String name;
	String description;
	
	public Courses(Long id, String name, String description) {
		super();
		Id = id;
		this.name = name;
		this.description = description;
	}
	public Courses()
	{
		super();
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Courses [Id=" + Id + ", name=" + name + ", description=" + description + "]";
	}
	
	
	
	

}
