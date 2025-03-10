<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

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
</head>
<body>

</body>
</html>