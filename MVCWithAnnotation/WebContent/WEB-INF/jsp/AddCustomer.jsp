<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<title>Adddddddd meeeeeeeeee</title>
</head>
<body>

<form:form action="#" method="post">
  <label>Customer Number</label>
  <form:input path="customerNumber"/>
  
  <label>Customer Name</label>
  <form:input path="customerName"/>
  
  <label>Email</label>
  <form:input path="email"/>
  
  <label>phone number</label>
  <form:input path="phoneNumber"/>
  
  <input type="submit" value="add">
  
</form:form>


</body>
</html>