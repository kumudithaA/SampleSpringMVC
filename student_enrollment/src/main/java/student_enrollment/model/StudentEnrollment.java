package student_enrollment.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "StudentEnrolement")
public class StudentEnrollment implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "enrollment_id") 
	private int enrollmentId;
	
	@Column(name = "enrolled_date")
	private Date enrolledDate;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@NotNull
	@JoinColumn(name = "stu_id")
	private Student stuId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@NotNull
	@JoinColumn(name = "sub_id")
	private Subject subId;

	public int getEnrollmentId() {
		return enrollmentId;
	}

	public void setEnrollmentId(int enrollmentId) {
		this.enrollmentId = enrollmentId;
	}

	public Date getEnrolledDate() {
		return enrolledDate;
	}

	public void setEnrolledDate(Date enrolledDate) {
		this.enrolledDate = enrolledDate;
	}

	public Student getStuId() {
		return stuId;
	}

	public void setStuId(Student stuId) {
		this.stuId = stuId;
	}

	public Subject getSubId() {
		return subId;
	}

	public void setSubId(Subject subId) {
		this.subId = subId;
	}


}
