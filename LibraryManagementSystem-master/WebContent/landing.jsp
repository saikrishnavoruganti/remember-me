<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel = "stylesheet" type = "text/css" href = "style.css"/>
</head>
<body>
	<center>
		<h1>Library Management System</h1>
	</center>
	<table border="1" width="100%" height="100%">
		<tr>
			<!--<td width="15%" valign="top" align="center"><br /> -->
			<!--<a href="Login.html">Login</a><br /> <br />
			<a href='Books.html'>Books Details</a> <br />
			<a href='Fee.html'>Membership Fee</a> <br />
			<a href='due.html'>Due</a> <br />
			<a href='Allbooks.html'>Books</a> <!-- <br/><a href="registration.html">Register</a><br/>-->
			</td>
			<td valign="top" align="center"><br />
				<form action="home" method="post">
					<table>
						<!--<tr>
							<td colspan="2" align="center"><b>Login Page</b></td>
						</tr>-->
						<tr>
							<td colspan="2" align="center"><b>&nbsp;&nbsp;&nbsp;</td>
						</tr>
						<tr>
							<td>&nbsp;</td>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td>&nbsp;</td>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td>&nbsp;</td>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td>&nbsp;</td>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td>&nbsp;</td>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td>&nbsp;</td>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td><input align="left" type="checkbox" name="librarian" onclick='window.location.assign("Librarian.jsp")'value="librarian" id="librarian"><label for="librarian"> Librarian</label></td>
							<td><input align="right" type="checkbox" name="user" onclick='window.location.assign("Books.jsp")' value="user" id="user"><label for="user"> User</label></td>
							<!--<td><input type="text" name="lname" /></td>-->
						</tr>
						<!--<tr>
							<td>Password</td>
							<td><input type="password" name="lpassword" /></td>
						</tr>-->
						<tr>
							<td>&nbsp;</td>
							<td>&nbsp;</td>
						</tr>
						<!--<tr>
							<td colspan="2" align="center"><input type="submit"
								value="Submit" /></td>
						</tr>-->
						<!--<tr>
							<td colspan="2" align="center"><br><br><a href="Books.html">Users can click here to browse the books!</a></td>
						</tr>-->
					</table>
				</form></td>
		</tr>
	</table>
</body>
</html>

