package com.skr.student.services;

import java.util.List;

import com.skr.student.entities.Student;

public interface StudentService {

	public void saveStudent(Student student);

	public List<Student> getStudents();
	
	public void deleteStudent(long id);
	public Student findStudentId(long id);
	
	public void saveOneStudent(Student student);
	
	
	
	
	
	
	
	
//	public Lead findOneLead(long id);
//
//	public void saveLead(Lead lead);

}
