<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>From Jsp</title>
</head>
<body>
	hi from jsp
	<div>${error}</div>
	<form action="/login.do" method="post">
	Enter the name <input type="text" name="name"><br>
	Enter the password <input type="password" name="password"><br>
	<button>Submit</button>
	</form>
</body>
</html>