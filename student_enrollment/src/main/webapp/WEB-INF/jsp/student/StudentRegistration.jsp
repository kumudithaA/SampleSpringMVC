<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script>
	function validate() {
		var email = document.getElementById('email').value;

		var emailFilter = /^([a-zA-Z0-9_.-])+@(([a-zA-Z0-9-])+.)+([a-zA-Z0-9]{2,4})+$/;

		if (!emailFilter.test(email)) {
			alert('Please enter a valid e-mail address.');
			return false;
		}

		return true;
	}
</script>
<title>Student Registration Form</title>
</head>
<body>
	<spring:url value="/student/saveStudent" var="saveURL" />

	<form:form action="${saveURL }" method="POST"
		modelAttribute="studentRegistrationForm" onsubmit="validate()">
		<form:hidden path="stu_id" />
		<table>
			<tr>
				<td>Name</td>
				<td><form:input path="firstName" /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><form:input id="email" path="email" /></td>
			</tr>
			<tr>
				<td></td>
				<td><button type="submit">Save</button></td>
			</tr>
		</table>
	</form:form>

</body>
</html>