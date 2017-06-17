<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Organization Home Page</title>
</head>
<body>
	<h1>Organization Home Page</h1>
	<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
	<ul>
		<li><a href="${contextPath}/jstlsql">List Organizations using JSTL sql tags</a></li>
		<li><a href="${contextPath}/service">List Organizations using Spring service</a></li>
	</ul>
</body>
</html>