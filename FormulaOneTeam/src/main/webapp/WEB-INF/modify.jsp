<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Modify existing Team</title>
</head>
<body>
<h1>Update Team Information</h1>
<form action="modify.do" method="POST">
  Team Name: <input type="text" name="name" value="${team.name}" /><br>
  Driver: <input type="text" name="driver" value="${team.driver}"/><br>
  Team Principle: <input type="text" name="teamPrinciple" value="${team.teamPrinciple}" /><br>
  Est. Year: <input type="text" name="estYear" value="${team.estYear}" /><br>
  Description: <input type="text" name="description" value="${team.description}" /><br>
  Factory Location (Country): <input type="text" name="factoryLocation" value="${team.factoryLocation}" /><br>
  <input type="hidden" value="${team.id}" name="id">
  <input type="submit" value="Submit" />
  </form>
  <br>
  <br>
  <form action="/" method="GET">
  <input type="submit" value="HOME" />
  </form>
</body>
</html>