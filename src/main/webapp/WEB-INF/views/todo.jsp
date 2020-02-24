<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Todo Page</title>
</head>
<body>
    <form action="/add-todo" method="POST">
        Description : <input name="desc" type="text" /> <input type="submit" value="add" />
    </form>
</body>
</html>