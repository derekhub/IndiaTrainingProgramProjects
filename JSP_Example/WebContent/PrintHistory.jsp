<%@ page import="java.util.*, com.training.models.*, com.training.servlet.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Print Payment History</title>
</head>
<body>

<% List<PaymentStatus> history = (List<PaymentStatus>)request.getAttribute("historyList"); %>


<table>
  <tr>
    <th>Transaction Id</th>    
    <th>Transaction date</th>    
    <th>Details</th>
    <th>Amount</th>
  </tr>
</table>


<% for(PaymentStatus pmt : history){ %>

  <table>
    <tr>
      <td><%= pmt.getTransactionId() %></td>
      <td><%= pmt.getTransactionDate() %></td>
      <td><%= pmt.getDescription() %></td>
      <td><%= pmt.getAmount() %></td>
    </tr>
  </table>
  
  <% } %>

</body>
</html>