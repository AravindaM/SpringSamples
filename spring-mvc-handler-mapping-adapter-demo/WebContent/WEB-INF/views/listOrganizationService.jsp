<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listing organizations using a Spring service</title>
</head>
<body>
	<h1>Listing organizations using a Spring service</h1>

	<c:forEach var="row" items="${orgList}">
		<div>--------------------</div>
	Name: ${row.companyName} <br />
	Year: ${row.yearOfIncoperation} <br />
	Zip: ${row.postalCode} <br />
	Emp Count: ${row.employeeCount} <br />
	Slogan: ${row.slogan} <br />
	</c:forEach>
	<br/>
	<br/>
	<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
	<a href="${contextPath}">Home</a>
</body>
</html>