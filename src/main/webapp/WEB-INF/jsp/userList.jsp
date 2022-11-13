<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<!-- saved from url=(0035)http://localhost:8080/deltagerliste -->
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	
	<link rel="stylesheet" href="./simple.css">
	<title>Participant list</title>
</head>
<body>
    <p>Innlogget som: ${currentUser.mobile} / ${currentUser.firstName} ${currentUser.lastName}</p>
	<h2>Participant list</h2>
	<table>
		<tbody><tr>
			<th>Gender</th>
			<th align="left">Name</th>
			<th align="left">Mobile</th>
		</tr>

		<c:forEach var="u" items="${users}">
            <tr style="${u.mobile.equals(currentUser.mobile) ? "background-color:limegreen;" : ""}">
				<td>${u.gender.equals("male") ? "&#9794;" : "&#9792;"}</td>
				<td>${u.firstName} ${u.lastName}</td>
				<td>${u.mobile}</td>
			</tr>
		</c:forEach>

	</tbody></table>
	<br>
	<form action="http://localhost:8080/logout" method="post">
	   <button type="submit">Log out</button> 
	</form>

</body></html>