<!DOCTYPE html>
<!-- saved from url=(0032)http://localhost:8080/paamelding -->
<html lang="no"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link href="simple.css" rel="stylesheet" type="text/css">
	<link href="main.css" rel="stylesheet" type="text/css">
	<script src="main.js" defer></script>  
	<title>Påmelding</title>
</head>

<body>
	<h2>Registartion</h2>
	
	<div style="color: red">${error}</div>
	
	<form id="deltagerFormBean" action="http://localhost:8080/registration" method="post">
		<fieldset>
		
			<label for="firstName">First Name</label>
			<!-- NB! Spring sin (form:input)-tag støtter ikke required alene, 
			     men greit med required="noe"! -->
			<input
				id="firstname" name="firstName" title="..." pattern="^[A-Z][a-zA-Z]{2,20}$" placeholder="Fill out first Name" required="required" type="text"
				oninvalid="this.setCustomValidity('First name must be capitalized and must have 2-20 characters')"
       			onvalid="this.setCustomValidity('')"
			></input>
            
            
            <label for="lastname">Last Name</label> 
            <input id="lastname" name="lastName" title="..." pattern="^[A-Z][a-zA-Z]{2,20}$" placeholder="Fill out last Name" required="required" type="text" 
            	oninvalid="this.setCustomValidity('Last name must be capitalized and must have 2-20 characters')"
       			onvalid="this.setCustomValidity('')"
            ></input>
            
            
            <label for="mobile">Mobile (8 siffer)</label>  
            <input id="mobile" name="mobile" title="..." pattern="\d{8}" placeholder="Fill out telephone Number" required="required" type="text"
            	oninvalid="this.setCustomValidity('Must be at least 8 digits and contain numbers only')"
       			onvalid="this.setCustomValidity('')"
            ></input>
            

            <label for="password">Password</label> 
            <input
            	id="password" name="password" title="..." pattern=".{5,}" placeholder="Choose a password" type="password" required="required"
            	onkeyup="checkPassword(event)"
            ></input>
            
            <label for="passordRepetert">Repeat your password</label> 
            <input
            	id="passordRepetert" name="repeatPassword" title="..." pattern=".{5,}" placeholder="Repeat your password" type="password" required="required"
            	onkeyup="doPasswordsMatch()"
            ></input>
            
            
			<label for="kjonn">Gender:</label> 
			<input id="kjonn1" name="gender" checked="checked" type="radio" value="male">male
			<input id="kjonn2" name="gender" type="radio" value="female">female
			     
			<br><br><button type="submit">Sign me in</button>
		</fieldset>
	</form>


</body></html>