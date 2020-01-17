<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Team Details</title>
</head>
<body>

<div>
  <h5>${team.name} (Established ${team.estYear})</h5>
  <p>Driver : ${team.driver}</p><br>
  <p>Team Principle : ${team.teamPrinciple}</p><br>
  <p>Factory Location : ${team.factoryLocation}</p><br>
  <p>${team.description}</p><br>
  <p></p>
</div>

</body>
</html>