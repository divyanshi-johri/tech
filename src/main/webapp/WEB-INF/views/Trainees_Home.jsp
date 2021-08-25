<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>traineeHome</title>
</head>
<body>
	<%-- <%
	response.setHeader("Cache-Control", "no-Chache, no-store,must-revalidate");
	//response.setDateHeader("Expires", 0); //proxies
	if (session.getAttribute("managerId") == null || session.getAttribute("role").equals("manager")) {
		response.sendRedirect("login");
	}
	%> --%>

	<h3>Welcome! ${userName}</h3>

	<h4>Rest functionality in development phase. Thanks!</h4>

</body>
</html>