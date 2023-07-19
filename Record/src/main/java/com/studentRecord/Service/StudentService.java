package com.studentRecord.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentRecord.Entity.Student;
import com.studentRecord.Repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository StudentRepo;
	
	public Student saveStudent(Student student) {
		return StudentRepo.save(student);
	}
	
	public List<Student> saveAllStudent(List<Student> student){
		return StudentRepo.saveAll(student);
	}
	
	public Student getStudentById(int id) {
		return StudentRepo.findById(id).orElse(null);
	}
	
	public List<Student> getAllStudent(){
		return StudentRepo.findAll();
	}
	
	public String deleteStudent(int id) {
		 StudentRepo.deleteById(id);

	        return "product removed !! " + id;
	}
	
	public String deleteAllStudent(){
		 StudentRepo.deleteAll();
		 return " All Record Deleted";
	}
}
