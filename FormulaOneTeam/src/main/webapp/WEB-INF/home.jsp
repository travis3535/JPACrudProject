<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formula One Database</title>
</head>
<body>
<h1>Formula One Team Database</h1>
<form action="create.do" method="GET">
  <input type="submit" value="Create New Team"  style="color:blue"/>
  </form>
  <br>
  
  <br>
<form action="getTeam.do" method="GET">
  Search by ID: <input type="text" name="id" />
  <input type="submit" value="Submit" /> 
</form>
<br>

  <c:forEach items="${findAll }" var="team">
<p>
	<a href="getTeam.do?id=${team.id}">${team.name} </a>	
</p>

</c:forEach>
  
</body>
</html>