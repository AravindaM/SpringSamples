<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listing organizations using a JSTL sql tag</title>
</head>
<body>
	<h1>Listing organizations using a JSTL sql tag</h1>
	<sql:query var="rs" dataSource="jdbc/springdb">
	SELECT * FROM organization  
</sql:query>

	<c:forEach var="row" items="${rs.rows}">
		<div>--------------------</div>
	Name: ${row.company_name} <br />
	Year: ${row.year_of_incoperation} <br />
	Zip: ${row.postal_code} <br />
	Emp Count: ${row.employee_count} <br />
	Slogan: ${row.slogan} <br />
	</c:forEach>
	<br/>
	<br/>
	<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
	<a href="${contextPath}">Home</a>
</body>
</html>