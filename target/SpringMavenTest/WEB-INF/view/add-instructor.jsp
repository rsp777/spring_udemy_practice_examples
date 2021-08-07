<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %><!-- Add support for JSTL Core Tags -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring Hibernate Example</title>
</head>
<body>
 <h1>Welcome</h1>
	<form:form action="add" modelAttribute="addInstructor" method="POST">
	<form:hidden path="id"/>
		
		<table>
		<tbody>
				<tr>
					<td><label>First Name : </label></td>
					<td><form:input path="firstName" /></td>
				</tr>
				<tr>
					<td><label>Last Name : </label></td>
					<td><form:input path="lastName" /></td>
				</tr>
				<tr>
					<td><label>Email : </label></td>
					<td><form:input path="email" /></td>
				</tr>
				
				<tr>
					<td><label>YouTube Channel : </label></td>
					
					<td><input type="text" name="youtubeChannel" value="${addInstructor.instructorDetail.youtubeChannel}" /></td>
				</tr>
				<tr>
					<td><label>Hobby : </label></td>
					<td><input type="text" name="hobby" value="${addInstructor.instructorDetail.hobby}"/></td>
					
				</tr>
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