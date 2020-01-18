<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Delete Team</title>
</head>
<body>
<h1>Confirm Removal of Team</h1>

<form action="delete.do" method="POST">
	<input type="hidden" value="${id}" name="id">
  <input type="submit" value="CONFRIM DELETE" color:red />
</form>
<br><br><br>
<form action="/" method="GET">
  <input type="submit" value="HOME" />
  </form>
</body>
</html>