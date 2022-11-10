<!DOCTYPE html>
<!-- saved from url=(0032)http://localhost:8080/innlogging -->
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" href="simple.css">
<title>Log in</title>
</head>
<body>
    <div style="color: red">${redirectMessage}</div>
	<h2>Logg inn</h2>
	<p style="color:red;"></p>
	<form action="login" method="post">
		<fieldset>
			<label for="mobile">Mobil:</label> <input type="text" name="mobile">
			<label for="password">Passord:</label> <input type="password" name="password">
			<br><br><button type="submit">Log in</button>
		</fieldset>
	</form>


</body></html>