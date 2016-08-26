<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Using Java Bean</title>
</head>
<body>

<jsp:useBean id="donor" class="com.training.entity.Donor" scope="session"></jsp:useBean>

<jsp:setProperty property="*" name="donor"/>

<%-- 
<h2>Thanks you have entered the follow details</h2>

<jsp:getProperty property="name" name="donor" />

<jsp:getProperty property="email" name="donor" />
--%>

<jsp:forward page="AddDonorServlet"></jsp:forward>

</body>
</html>