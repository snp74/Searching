<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="CountryData" method="post">

<fieldset><legend align="center">Search Box</legend>

<input type="text" name="search_Box" >
<input type="submit" name="search_Button" value="Search" />
</fieldset>
</form>
<%
String nameOfCountryRecived=(String)request.getAttribute("DATA");
 System.out.println("nameOfCountryRecived :"+request.getParameter("NameCountry"));
 if(null==nameOfCountryRecived)
{
	nameOfCountryRecived="";
	
}  
%>
<h1><%=nameOfCountryRecived%></h1>
</body>
</html>