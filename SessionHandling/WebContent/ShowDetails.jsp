<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show details</title>
</head>
<body>

  <p>Is New Session</p><%=session.isNew() %>
  <p>Session ID</p><%=session.getId() %>

<div style="float: right;">
  <p>currently logged in at:</p>${currUser }
</div>

<div>
  <form action="SessionManager">
    <input type="submit" value="logout">
  </form>
</div>

</body>
</html>