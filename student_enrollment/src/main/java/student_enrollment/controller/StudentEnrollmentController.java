package student_enrollment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import student_enrollment.model.Student;
import student_enrollment.model.StudentEnrollment;
import student_enrollment.service.StudentEnrollmentSevice;
import student_enrollment.service.StudentService;

@Controller
@RequestMapping(value = "/studentenrollment")
public class StudentEnrollmentController {

	@Autowired
	StudentEnrollmentSevice studentEnrollmentSevice;
	
	@RequestMapping(value = "/enroll", method = RequestMethod.POST)
	public ModelAndView enrollStudent(@ModelAttribute("enrollmentForm") StudentEnrollment studentEnrollment) {
		
		studentEnrollmentSevice.enrollStudent(studentEnrollment);
		return new ModelAndView("redirect:/student/list");
	}
}
