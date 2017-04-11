<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script>
	$(document).ready(function(){
		
		$("#ret").on("click", function()
		{
			var empId = $("#empId").val();
			$.get("retrive?"+"empId=" + empId, function(data, status){
				$('#empName').val(data.empName);
				$('#empPhone').val(data.empPhone);
				$('#empAddress').val(data.empAddress);
				$('#empEmailId').val(data.empEmailId);
			});
		});
		
		$("#retAll").on("click", function()
		{
			$.get("retriveall", function(data, status){
			
				if(data){
		            var len = data.length;
		            var txt = "";
		            if(len > 0){
		                for(var i=0;i<len;i++){
		                        txt += "<tr><td>"+data[i].empId+"</td><td>"+data[i].empName+"</td><td>"+data[i].empPhone+"</td><td>"+data[i].empAddress+"</td><td>"+data[i].empEmailId+"</td></tr>";
		                   }
		                if(txt != ""){
		                    $("#table").append(txt).removeClass("hidden");
		                }
		            }
		  	   }
			});		
		});
	});
</script>
</head>
<body>
	<center>
		<h1>Add/Delete User Details</h1>
	</center>
	<table border="1" width="100%" height="100%">
		<tr>
			<td valign="top" align="center"><br />
				<form>
					<table>
						<!--<tr>
							<td colspan="2" align="center"><b>Login Page</b></td>
						</tr>-->
						<tr>
							<td colspan="2" align="center"><b>&nbsp;</td>
						</tr>
						<tr>
							<td>User ID:</td>
							<td><input id="userid" type="text" name="id" /></td>
						</tr>
						<tr>
							<td>User Name:</td>
							<td><input id="userName" type="text" name="name" /></td>
						</tr>
						<tr>
							<td>user PhoneNo:</td>
							<td><input id="userPhone" type="text" name="phone" /></td>
						</tr>
						<tr>
							<td>User EmailID:</td>
							<td><input id="userEmailId" type="text" name="email" /></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td align="center">
								<input type="submit" formaction="insert" formmethod="post" value="Insert Record" />
							</td>
							<td align="left"><input type="submit" formaction="delete" formmethod="post"
								value="Delete Record" /></td>
							<!--<td align="left"><input type="submit" formaction="update" formmethod="post"
								value="Update Record" /></td>	
							<td align="left"><input type="button" id="ret" 
								value="Retrive Record" /></td>	
							<td align="left"><input type="submit" formaction="delete" formmethod="post"
								value="Delete Record" /></td>	
							<td align="left"><input type="button" id="retAll"
								value="Retrive All Record" /></td>
						</tr>
						<table id="table" class="hidden">
						    <tr>
						        <th>EMP ID</th>
						        <th>EMP NAME</th>
						        <th>EMP PHONE</th>
						        <th>EMP ADDRESS</th>
						        <th>EMP EMAILID</th>
						    </tr>
						</table>-->
					</table>
				</form></td>
		</tr>
	</table>
</body>
</html>

