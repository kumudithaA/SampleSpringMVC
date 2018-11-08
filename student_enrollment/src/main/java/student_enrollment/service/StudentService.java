package student_enrollment.service;

import org.springframework.stereotype.Service;

import student_enrollment.model.Student;

@Service
public interface StudentService {
	
	public void saveStudent(Student student);
}
