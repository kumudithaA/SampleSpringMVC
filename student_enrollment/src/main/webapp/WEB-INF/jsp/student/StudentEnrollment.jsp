<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Enrollment Form</title>
</head>
<body>
	<spring:url value="/studentenrollment/enroll" var="saveURL" />

	<form:form action="${saveURL }" method="POST" modelAttribute="enrollmentForm">
		<form:hidden path="enrollmentId" />
		<table>
			<tr>
				<td>Enrolled Date</td>
				<td><form:input path="enrolledDate" /></td>
			</tr>
			<tr>
				<td>Student Id</td>
				<td><form:input path="stuId" /></td>
			</tr>
			<tr>
				<td>Subject Id</td>
				<td><form:input path="subId" /></td>
			</tr>
			
			<tr>
				<td></td>
				<td><button type="submit">Save</button></td>
			</tr>
		</table>
	</form:form>

</body>
</html>