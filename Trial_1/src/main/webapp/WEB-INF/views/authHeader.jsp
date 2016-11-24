<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="authbar">
		<span>Dear <strong>${loggedinuser}</strong>, Welcome to
			CrazyUsers.
		</span> <span class="floatRight"><a href="<c:url value="/logout" />">Logout</a></span>
	</div>
</body>
</html>