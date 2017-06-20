<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>@RequestMapping and @RequestParam test Bed</title>
<style>
	input[type=text] {
		padding:10px;
		margin:10px;
		font-size:20px;
	}
	
	input[type=submit] {
			border:none;
			background-color: #4CAF50;
			color:white;
			padding:16px;
			margin:16px;
			cursor: pointer;
			font-size: 10px;
		}
		
		h2 {
			color:#08298A;
			text-align:center;
		}
	
</style>
</head>
<body>

<div align="left">
	<h2 align="center">Hello Welcome to @RequestMapping and @RequestParam test Bed</h2>
	<hr/>
	<form action="test1">
		<h3>Test1: Testing  @RequestParam explicit attributes</h3>
		<label id="organization-name">Organization Name</label>
		<input type="text" name="orgName" placeholder="Enter Orgnization Name" size="40" />
		<input type="submit" value="submit"/>
	</form>
</div>


</body>
</html>