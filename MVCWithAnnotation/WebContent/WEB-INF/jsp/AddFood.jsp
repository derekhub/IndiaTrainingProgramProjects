<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<title>Add Food Items</title>
</head>
<body>

<form:form action="#" method="post">
  <label>Food Item Code</label>
  <form:input path="foodCode"/>
  
  <label>Description</label>
  <form:input path="description"/>
  
  <label>Unit Price</label>
  <form:input path="unitPrice"/>
  
  <input type="submit" value="add">
  
</form:form>


</body>
</html>