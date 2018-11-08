package student_enrollment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import student_enrollment.dao.StudentDao;
import student_enrollment.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	StudentDao studentDao;

	@Autowired
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public void saveStudent(Student student) {
		studentDao.saveOrUpdate(student);
	}
	
	
}
