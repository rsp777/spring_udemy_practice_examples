<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><!-- Add support for JSTL Core Tags -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
<!-- Reference the style sheet -->
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>Instructors</h2>
		</div>
	</div>

	<p>Spring Hibernate One-to-Many Mapping Bi-directional CRUD project.</p>
	<form:form action="search" method="GET">
		Search: <input type="text" name="search_id_name">
		<input type = "submit" value="Search">
	</form:form>
	<br	>
	<table class="center">
		<tbody>
			<tr>
			    <th>ID</th>
				<th>FIRST NAME</th>
				<th>LAST NAME</th>
				<th>EMAIL</th>
				<th>YOUTUBE CHANNEL</th>
				<th>HOBBY</th>
				<th>COURSE</th>
				<th>ACTION</th>
				
			</tr>
			
				<c:forEach  var="tempInstructor" items="${addInstructors}">
				<c:url var="deleteLink" value="/instructors/delete">
					<c:param name="instructorId" value="${tempInstructor.id}"/>				
				</c:url>
				
				<c:url var="updateLink" value="/instructors/showFormForUpdate">
					<c:param name="instructorId" value="${tempInstructor.id}"/>				
				</c:url>
				
				<c:url var="c" value="/instructors/showFormForUpdate">
					<c:param name="instructorId" value="${tempInstructor.id}"/>				
				</c:url>
				<c:url var="addTheCourse" value="/instructors/showFormForAddCourse">
					<c:param name="instructorId" value="${tempInstructor.id}"/>				
				</c:url>
				<tr>
				    <td>${tempInstructor.id}</td>
					<td>${tempInstructor.firstName}</td>
					<td>${tempInstructor.lastName}</td>
					<td>${tempInstructor.email}</td>
					<td>${tempInstructor.instructorDetail.youtubeChannel}</td>
					<td>${tempInstructor.instructorDetail.hobby}</td>
					<td>${tempInstructor.courses}</td>
					
					<td>
						<a href="${updateLink}">
						Update</a>
					|
						<a href="${deleteLink}"
						onclick="if(!(confirm('Are you sure want to delete this customer?'))) return false">
						Delete</a>
					|
						<a href="${addTheCourse}">Add Course</a>
						<a href="#">View Courses</a>
						<a href="${updateLink}">Post Review</a>		
					</td>
					
				</tr>
				
				</c:forEach>
				<tr>
					<input type = "button" value = "Add Instructor"
					onclick="window.location.href = '${pageContext.request.contextPath}/instructors/showFormForAdd'; return false;"/>	
				</tr>	
			
		</tbody>
	</table>
</body>
</html>
