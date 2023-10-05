package com.skr.student.services;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skr.student.entities.Student;
import com.skr.student.repositories.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

@Autowired
private StudentRepository studentRepository;

public void saveStudent(Student student) {
	studentRepository.save(student);
	
}

public List<Student> getStudents() {
	List<Student> students = studentRepository.findAll();
	return students;
}

public void deleteStudent(long id) {
	studentRepository.deleteById(id);
	
}

public Student findStudentId(long id) {
	 Optional<Student> findById = studentRepository.findById(id);
	 Student student = findById.get();
	return student;
}

public void saveOneStudent(Student student) {
	studentRepository.save(student);
} 


//@Override
//public Lead findOneLead(long id) {
//	Optional<Lead> findById = leadRepo.findById(id);
//	Lead lead = findById.get();
//	return lead;
//}
//
//@Override
//public void saveLead(Lead lead) {
//	leadRepo.save(lead);
//}

}
