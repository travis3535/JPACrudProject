<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create New Formula One Team</title>
</head>
<body>
<h1>Create Page</h1>

<form action="create.do" method="POST">
  Team Name: <input type="text" name="name" value="${team.name}" /><br>
  Driver: <input type="text" name="driver" /><br>
  Team Principle: <input type="text" name="teamPrinciple" /><br>
  Est. Year: <input type="text" name="estYear" /><br>
  Description: <input type="text" name="description" style="width: 300px"/><br>
  Factory Location (Country): <input type="text" name="factoryLocation" />
  <br>
  <br>
  <input type="submit" value="Submit" style="color:red"/>
  </form>
  
  <br>
  <br>
  <br>
  <form action="/" method="GET">
  <input type="submit" value="HOME" style="width: 100px;"/>
  </form>
</body>
</html>