package student_enrollment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import student_enrollment.model.Student;
import student_enrollment.service.StudentService;

@Controller
@RequestMapping(value = "/student")
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@RequestMapping(value = "/saveStudent", method = RequestMethod.POST)
	public void saveStudent(@ModelAttribute("studentRegistrationForm") Student student) {
		studentService.saveStudent(student);
		
	}
	
	

}
