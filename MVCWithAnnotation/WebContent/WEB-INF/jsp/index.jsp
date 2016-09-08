<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring MVC</title>
</head>
<body>

<h1 style="text-align:center">Spring MVC with Annotations</h1>

<section>
  <ul>
    <li><a href="addFood">Form Handling</a></li>
    <li><a href="addCustomer">add customer</a></li>
    <li><a href="studentDetails">find student details</a></li>
  </ul>
</section>

<form action="addCustomer/findCustomer" method="post">
Customer Id: <input type="text" name="key"><br>
<input type="submit" value="Find">
</form>

<form action="addCustomer/findAllCustomers" method="get">
<input type="submit" value="Find All">
</form>

</body>
</html>