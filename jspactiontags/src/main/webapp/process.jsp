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
    int x = Integer.parseInt(request.getParameter("t1"));
    String y = request.getParameter("t2");
    
%>




<jsp:forward page="Page2.jsp">
        <jsp:param name="name" value="<%= x %>"/>
        <jsp:param name="age" value="<%= y %>"/>
    </jsp:forward>

</body>
</html>