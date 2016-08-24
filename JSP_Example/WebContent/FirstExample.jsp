<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My First JSP</title>
</head>
<body>

<%@ include file="Header.html" %>

  <!-- HTML Comment -->

  <% out.println("Welcome to JSP Programming"); %>
  
  <%! String instanceName = "Ramesh";  %> <%-- Declaration Global - at the class level --%>
  
  <% String localName = "Ganesh"; %> <%-- declaration local to service method --%>
  
  <%=instanceName %>
  <%=localName %>
  
<jsp:include page="Footer.jsp"></jsp:include>

</body>
</html>