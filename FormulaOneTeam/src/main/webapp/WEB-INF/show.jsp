<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Team Details</title>
</head>
<body>
<h1>Formula One Team Information</h1>
<div>
  <h2>${team.name} (Established ${team.estYear})</h2>
  <p>Driver : ${team.driver}</p><br>
  <p>Team Principle : ${team.teamPrinciple}</p><br>
  <p>Factory Location : ${team.factoryLocation}</p><br>
  <p>Description: ${team.description}</p><br>
  <p></p>
</div>
<form action="modify.do" method="GET">
  <input type="hidden" value="${team.id}" name="id">
  <input type="submit" value="MODIFY" />
  </form>
  <br>
  <br>
<form action="delete.do" method="GET">
<input type="hidden" value="${team.id}" name="id">
  <input type="submit" value="DELETE" style="color:red" />
  </form>
  <br>
  
  <br>
  <br>
  <form action="/" method="GET">
  <input type="submit" value="HOME" style="width: 100px;"/>
  </form>
</body>
</html>