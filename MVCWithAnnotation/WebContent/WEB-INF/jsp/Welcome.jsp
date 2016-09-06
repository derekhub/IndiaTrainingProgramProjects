<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>

${itemAdded}

<table style="border: 2px solid blue">
  <tr>
    <td>${itemAdded.foodCode}</td>
    <td>${itemAdded.description}</td>
    <td>${itemAdded.unitPrice}</td>
  </tr>
</table>

</body>
</html>