package com.studentRecord.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentRecord.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
