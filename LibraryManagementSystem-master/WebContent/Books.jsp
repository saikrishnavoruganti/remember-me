<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script>
$(document).ready(function(){
	$.get("Books", function(data, status){
		if(data){
            var len = data.length;
            var txt = "";
            if(len > 0){
                for(var i=0;i<len;i++){
                        txt += "<tr><td>"+data[i].id+"</td><td>"+data[i].name+"</td><td>"+data[i].author_name+"</td><td>"+data[i].year+"</td></tr>";
                   }
                if(txt != ""){
                    $("#table").append(txt).removeClass("hidden");
                }
            }
        }
    });
});
</script>
</head>
<body>
	<center>
		<h1>Books</h1>
	</center>
	<table id="table" class="hidden">
    <tr>
        <th>ID</th>
        <th>BOOK_NAME</th>
        <th>AUTHOR_NAME</th>
        <th>YEAR</th>
    </tr>
</table>
</body>
</html>
