<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>For booking later</title>
</head>
<body>

<form action="DisplayBookingLaterInformationServlet" method="post">

  Name: <input type="text" name="name" value="${currentUserName }" readonly><br> 
  Telephone: <input type="text" name="telephone" value="${currentTelephone }" readonly><br>
  Booking Type: <select name="type">
  <option value="meter">meter</option>
  <option value="type2">type2</option>
  <option value="type3">type3</option>
</select><br>
  Pickup Place: <input type="text" name="pickupPlace"><br>
  Drop Place: <input type="text" name="dropPlace"><br>
  Pick Up Date: <input type="date" name="date"><br>
  Pick Up Time: <input type="time" name="time"><br>
  
  <input type="submit" value="Book Now">
  
</form>

</body>
</html>