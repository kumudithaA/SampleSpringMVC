package student_enrollment.dao;

import java.util.Date;

import student_enrollment.model.Student;
import student_enrollment.model.StudentEnrollment;
import student_enrollment.model.Subject;

public interface StudentEnrollmentDao {
	
	public void saveOrUpdate(StudentEnrollment studentEnrollment);
	
	public boolean checkAavailability(Student studentId, Subject subjectId, Date date);
	
	public int enrollmentsPerDay(Student studentId,Date date);
	
	public String getStudentEmail(Student studentId);

}
