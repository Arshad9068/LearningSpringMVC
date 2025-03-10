<%@page import="java.time.LocalDateTime"%>
<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hii This is about page</h1>

	<%
	/* String name = (String) request.getAttribute("name");

	Integer id = (Integer) request.getAttribute("id");

	LocalDateTime datetime = (LocalDateTime) request.getAttribute("dt"); */
	%>

	<h1>
		Name is ${name }
		<%-- <%=name%> --%>
	</h1>
	<h1>
		Id is ${id }
		<%-- <%=id%> --%>
	</h1>
	<h1>Date Time is ${dt }</h1>
	<%-- <%=datetime%></h1> --%>
</body>
</html>