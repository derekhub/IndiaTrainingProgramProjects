<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Confirmation Page</title>
</head>

<a href="index.jsp"> Index</a> 

<body>

<h1>ARE THESE YOUR DETAILS?!?!?!?!?!?</h1>

${strName } <br>
${intTelephone } <br>
${strBookingType } <br>
${strPickupPlace } <br>
${strdropPlace } <br>

<form action="AvailableCabsNow.jsp" method="post">
  <input type="submit" value="Confirm">
</form>

 

</body>
</html>