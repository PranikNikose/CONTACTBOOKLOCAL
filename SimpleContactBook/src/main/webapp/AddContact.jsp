<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Contact</title>
</head>
<body>

	<br>
	<br>
	<a href="Home.jsp">Home</a> &emsp;
	<a href="Search.jsp">Search</a>
	<br>
	<br>


	<form action="AddContact" method="post">

		<table>
			<tr>
				<td>Name :</td>
				<td><input type="text" name="Name" required></td>
			</tr>
			<tr>
				<td>Email :</td>
				<td><input type="email" name="Email"></td>
			</tr>

			<tr>
				<td>Mobile :</td>
				<td><input type="number" name="Mobile" required></td>
			</tr>

			<tr>
				<td>Occupation :</td>
				<td><input type="text" name="Occupation"></td>
			</tr>


			<tr>
				<td>Place :</td>
				<td><input type="text" name="Place"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Save Contact"></td>
			</tr>
		</table>
	</form>
</body>
</html>