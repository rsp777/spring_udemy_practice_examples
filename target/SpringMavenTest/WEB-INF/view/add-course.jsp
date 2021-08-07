<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><!-- Add support for JSTL Core Tags -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<table>
		<tbody>
			<form:form modelAttribute="addInstructor" method="GET">
				<tr>
					<td><label>First Name : </label></td>
					<td><input type="text" name="firstName" value="${addInstructor.firstName}" 
					readonly="true"/></td>
				</tr>
				<tr>
					<td><label>Last Name : </label></td>
					<td><input type="text" name="lastName" value="${addInstructor.lastName}" 
					readonly="true"/></td>
				</tr>
				<tr>
					<td><label>Email : </label></td>
					<td><input type="text" name="email" value="${addInstructor.email}" 
					readonly="true"/></td>
				</tr>
				
				<tr>
					<td><label>YouTube Channel : </label></td>
					
					<td><input type="text" name="youtubeChannel" value="${addInstructor.instructorDetail.youtubeChannel}" 
					readonly="true"/></td>
				</tr>
				<tr>
					<td><label>Hobby : </label></td>
					<td><input type="text" name="hobby" value="${addInstructor.instructorDetail.hobby}" readonly="true"/></td>
					
				</tr>
			</form:form>
	<form:form action="add_course" modelAttribute="addCourse" method="POST">
		<form:hidden path="id"/>
		
		
				
				<tr>
					<td><label>Course : </label></td>
					<td><input type="text" name="newCourse" value="${addInstructor.courses}"/></td>
				</tr>
				<tr>
					<td><label>Post Review : </label></td>
					<td><input type="text" name="reviews" value=""/></td>
				</tr>
			
				<tr>
					<td><input type="submit" value="Save"></td>
				</tr>
			</tbody>
	</table>
	</form:form>
</body>
</html>