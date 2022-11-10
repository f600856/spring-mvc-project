<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<!-- saved from url=(0035)http://localhost:8080/deltagerliste -->
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	
	<link rel="stylesheet" href="./simple.css">
	<title>Deltagerliste</title>
</head>
<body>
    <p>Innlogget som: ${currentUser.mobile} / ${currentUser.firstName} ${currentUser.lastName}</p>
	<h2>Deltagerliste</h2>
	<table>
		<tbody><tr>
			<th>Kjønn</th>
			<th align="left">Navn</th>
			<th align="left">Mobil</th>
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
	   <button type="submit">Logg ut</button> 
	</form>

</body></html>