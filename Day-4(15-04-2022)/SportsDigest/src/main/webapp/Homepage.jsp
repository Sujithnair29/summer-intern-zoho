<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body  bgcolor=FDE4CF  >

<p align="center"><font size=10 face="Gorgia"><b><u>SportsDigest</u></b></font></p>


<h1 align="center" >
<%String uname=request.getParameter("uname"); 
out.println("Welcome "+uname);%>
</h1>


<h2 align="center">
<A href = "Cricket.jsp"> Are you a cricketer </A>
<br>
<br>
or 
<br>
<br>

<A href = "Football.jsp"> Are you a Footballer 
</A>
</h2>


</body>
</html>