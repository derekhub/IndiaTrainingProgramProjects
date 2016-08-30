<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>RRRRRREGISTER HERE</title>
</head>

<a href="index.jsp"> Index</a> <br>

<body>

<form action="RegisterServlet" method="post">

  <label>Register here </label><br><br>
  Name: <input type="text" name="name"><br>
  Email: <input type="text" name="email"><br>
  Password: <input type="text" name="password"><br>
  Telephone: <input type="text" name="telephone"><br>
  City: <input type="text" name="city"><br>
  
  <input type="submit" value="register">
  
</form>


</body>
</html>