<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html> <body>
<center><h1>Librarian Registration Form</h1></center>
<table border="1" width="100%" height="100%">
<tr>
	<!--<td width="15%" valign="top" align="center">
		<br/><a href="Login.html">Login</a><br/>
		<br/><a href="registration.html">Register</a><br/>
	</td> -->
	<td valign="top" align="center"><br/>
		<form action="reg"><table>
		<tr>
			<td colspan="2" align="center"><b>Registration Page</b></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><b>&nbsp;</td>
		</tr>
		<tr>
		<tr>
			<td>User Name</td>
			<td><input id="uname" type="text" name="uname" required autofocus/></td>
			<br>
		</tr>
		<tr>
			<td>Password</td>
			<td><input id="pass" type="password" name="pass"/></td>
		</tr>
		<tr>
			<td>Re-Password</td>
			<td><input id="repass" type="password" name="repass"/></td>
		</tr>
		<tr>
			<td>Address</td>
			<td><input id="addr" type="text" name="addr"/></td>
		</tr>
		<tr>
			<td>Phone Number</td>
			<td><input id="phno" type="text" name="phno"/></td>
		</tr>
		<tr>
			<td>Email ID</td>
			<td><input id="email" type="text" name="email"/></td>
		</tr>
		<tr>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
		</tr>
		<td align="center">
		<input type="submit" formaction="registration" formmethod="post" value="registration" />
		</td>
		<!--<tr>
			<td colspan="2" align="center"><input type="submit" value="Register"/></td>
		</tr> -->
		</table></form>
	</td>
</tr>
</table>
</body></html>

