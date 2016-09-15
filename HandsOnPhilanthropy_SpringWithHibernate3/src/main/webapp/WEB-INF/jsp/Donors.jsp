<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

</head>
<body>


	<h1>Donors</h1>
	
	<br>
	<script type="text/javascript">
	$(function(){
			$.ajax({
				type:"GET",
				dataType:"json",
				//url:"http://jsonplaceholder.typicode.com/users/" + escape(userCode),
				url:"/HandsOnPhilanthropy_SpringWithHibernate3/ViewDonor/${projectID}" ,
				error:function(xhr, textStatus, errorThrown){
					console.log(errorThrown);
					alert("Error");
				},
				success:function(data, textStatus){
					console.log(data);
					output = "";
					for(donor in data["ListofDonors"]){

						//private long handPhone;
						//private String donorName;
						//private String email;
						//private Address address;
						
						output = output +  ( parseInt(donor)+1) + ": " +" Name=" + data["ListofDonors"][donor]["donorName"]   + "<br>"
														  +" Email=" + data["ListofDonors"][donor]["email"]   + "<br>"
														  +" Address=" + data["ListofDonors"][donor]["address"]["cityName"]   + "<br>"
														  +" HandPhone=" + data["ListofDonors"][donor]["handPhone"]   + "<br><hr/>";
					}
					$("#output").html(output);
				}				
				});
	});
	</script>
	
	
	<div id="output"></div>
</body>
</html>