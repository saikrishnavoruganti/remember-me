<%@ page language="java" contentType="text/html; charset=iso-8859-1"
    pageEncoding="iso-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">

<title>Remember Login With JSP-Servlet</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
</head>
<body>
<fieldset>
<form method ="post" action="AccountController">
${error }
<div style="padding: 100px 0 0 250px;">
<div id="login-box">
<h2>Dixon Group </h2>
<h3>Please provide your credential to use this website</h3>
<br>
<br>

<tr> 
<div id="Username" style="margin-top:20px;">Username</div>
<td> <input type="text" name ="username"></td>
</tr> 
<tr> 
<div id="Password" style="margin-top:20px;">Password</div>
<td> <input type="password" name ="password"></td>
</tr> 
<span class="login-box-options">
<tr> 
<td>&nbsp;</td>
<td> <input type="checkbox" name ="remember"> Remember me?</td>
</tr> 

<tr> 
<td>&nbsp;</td>
<td> <input type="submit" value="Login"></td>
</tr> 
</span>
</form>
</fieldset>
</body>
</html>