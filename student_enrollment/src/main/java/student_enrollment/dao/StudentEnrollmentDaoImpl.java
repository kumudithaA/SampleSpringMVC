package student_enrollment.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import student_enrollment.model.Student;
import student_enrollment.model.StudentEnrollment;
import student_enrollment.model.Subject;

@Repository
public class StudentEnrollmentDaoImpl implements StudentEnrollmentDao{

	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void saveOrUpdate(StudentEnrollment studentEnrollment) {
		getSession().saveOrUpdate(studentEnrollment);
	}

	public boolean checkAavailability(Student studentId, Subject subjectId, Date date) {
		
		Criteria cr = getSession().createCriteria(StudentEnrollment.class);
		cr.add(Restrictions.eq("stu_id", studentId));
		cr.add(Restrictions.eq("sub_id", subjectId));
		cr.add(Restrictions.eq("enrolled_date", date));
		StudentEnrollment uniqueResult = (StudentEnrollment) cr.uniqueResult();
		
		if(uniqueResult != null) {
			
			return true;
		}
		
		return false;
		
		
	}

	public int enrollmentsPerDay(Student studentId, Date date) {
		
		Criteria cr = getSession().createCriteria(StudentEnrollment.class);
		cr.add(Restrictions.eq("stu_id", studentId));
		cr.add(Restrictions.eq("enrolled_date", date));
		List<StudentEnrollment> enrollmentList = cr.list();
		
		return enrollmentList.size();
	}
	
	public String getStudentEmail(Student studentId) {
		
		Criteria cr = getSession().createCriteria(Student.class);
		cr.add(Restrictions.eq("stu_id", studentId));
		Student student = (Student) cr.uniqueResult();
		
		if(student != null) {
		return 	student.getEmail();
		}
		return null;
		
	}

}
