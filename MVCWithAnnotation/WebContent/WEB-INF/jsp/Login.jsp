<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

</head>
<body>

<spring:message code="lbl.btn.submit" var="btnText"></spring:message>

<form:form action="" method="post">

  <spring:message code="lbl.userName"></spring:message>
  <form:input path="userName"></form:input>
  
  <spring:message code="lbl.passWord"></spring:message>
  <form:input path="passWord"></form:input>
  
  <spring:message code="lbl.phoneNumber"></spring:message>
  <form:input path="phoneNumber"></form:input>
  
  <form:input path="submit" value="${btnText }"></form:input>
  
</form:form>

</body>
</html>