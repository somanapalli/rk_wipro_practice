<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>display jsp page</title>
</head>
<body>



    <p>Name: <%= request.getParameter("stid") %></p>
    <p>Age: <%= request.getParameter("stname") %></p>

</body>
</html>