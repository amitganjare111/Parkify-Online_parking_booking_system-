package com.studentRecord.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.studentRecord.Entity.Student;
import com.studentRecord.Service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/")
	public ModelAndView register () {
	    ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("register");
	    return modelAndView;
	}
	
	@PostMapping("/saveStudent")
	public Student saveStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}
	
	@PostMapping("/saveAllStudent")
	public List<Student> saveAllStudent(@RequestBody List<Student> student){
		return studentService.saveAllStudent(student);
	}
	
	@GetMapping("/getStudentById/{id}")
	public Student getStudentById(int id) {
		return studentService.getStudentById(id);
	}
	
	@GetMapping("/getAllStudent")
	public List<Student> getAllStudent(){
		return studentService.getAllStudent();
	}
	
	@DeleteMapping("/deleteByIdStudent/{id}")
	public String deleteStudent(@PathVariable int id) {
		 studentService.deleteStudent(id);
		 return "deleted record" +id;
	}
	
	@DeleteMapping("/deleteAllStudent")
	public String deleteAll() {
		studentService.deleteAllStudent();
		return "deleted all record";
	}
}
