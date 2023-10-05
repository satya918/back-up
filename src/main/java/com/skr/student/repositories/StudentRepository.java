package com.skr.student.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.skr.student.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}

