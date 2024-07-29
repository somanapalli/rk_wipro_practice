<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
    int stid = Integer.parseInt(request.getParameter("t1"));
    String stname = request.getParameter("t2");
    out.println("student id is: " + stid);
    out.println("student name is: " + stname);

%>

</body>
</html>