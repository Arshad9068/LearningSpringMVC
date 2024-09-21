<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hii I'm Home Controller</h1>

	<%-- <%
	/* 	String name = (String) request.getAttribute("name");

		Integer id = (Integer) request.getAttribute("id");
		
		
		List<String> friends = (List<String>) request.getAttribute("frnd"); */
	%> --%>

	<h1>
		Name is ${name }
		<%-- <%=name%> --%>
	</h1>
	<h1>
		Id is ${id }
		<%-- <%=id%> --%>
	</h1>
	<%-- 	<% for(String s: friends){ %>
	<h1><%=s %></h1>
	<% } %> --%>
	
	<c:forEach var="item"
	 items="${frnd }">
		<h1>${item }</h1>
	</c:forEach>

</body>
</html>