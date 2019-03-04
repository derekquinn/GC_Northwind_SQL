<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Northwind | Destiny</title>
</head>
<body>




<table>
				<tr>
					<th>Supplier</th><th>City</th>
				</tr>

	
				<c:forEach var="winds" items="${ winds }">
				
				<tr>
					<td>${ winds.company}</td>
					<td>${ winds.city }</td>
					
				</tr>
				</c:forEach>
		
		</table>

</body>
</html>