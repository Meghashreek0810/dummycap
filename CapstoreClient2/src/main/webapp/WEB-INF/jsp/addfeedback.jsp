<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>add feedback</title>
</head>
<body>
<form action="/addingFeedback" method="post" modelAttribute="feedback" enctype="multipart/form-data">
		<label>Feedback</label></br>
		product id<input type="text" name="productId"  ><br>
		feedback id<input type="text" name="feedbackId"  ><br>
		feedback title<input type="text" name="feedbackTitle"  ><br>
		feedback description<input type="text" name="feedbackDescription"  ><br>
		date<input type="text" name="date"  ><br>
		rating<input type="text" name="rating"  ><br>
		<input type="submit">
	</form>
	
	<br>
	
</body>
</html>