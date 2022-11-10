<!DOCTYPE html>
<!-- saved from url=(0032)http://localhost:8080/paamelding -->
<html lang="no"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link href="simple.css" rel="stylesheet" type="text/css">
<!-- <script src="js/myscript.js" defer></script>  -->  
	<title>Påmelding</title>
</head>

<body>
	<h2>Påmelding</h2>
	
	<div style="color: red">${error}</div>
	
	<form id="deltagerFormBean" action="http://localhost:8080/registration" method="post">
		<fieldset>
		
			<label for="fornavn">Fornavn</label>
			<!-- NB! Spring sin (form:input)-tag støtter ikke required alene, 
			     men greit med required="noe"! -->
			<input id="fornavn" name="firstName" title="..." pattern=".*" placeholder="Fyll inn fornavn" required="required" type="text" value="">
            
            
            <label for="etternavn">Etternavn</label> 
            <input id="etternavn" name="lastName" title="..." pattern=".*" placeholder="Fyll inn etternavn" required="required" type="text" value="">
            
            
            <label for="mobil">Mobil (8 siffer)</label>  
            <input id="mobil" name="mobile" title="..." pattern=".*" placeholder="Fyll inn telefonnummer" required="required" type="text" value="">
            

            <label for="passord">Passord</label> 
            <input id="passord" name="password" title="..." pattern=".*" placeholder="Velg et passord" type="password" required="required" value="">
            
            
            <label for="passordRepetert">Passord repetert</label> 
            <input id="passordRepetert" name="repeatPassword" title="..." pattern=".*" placeholder="Gjenta passord" type="password" required="required" value="">
            
            
			<label for="kjonn">Kjønn:</label> 
			<input id="kjonn1" name="gender" checked="checked" type="radio" value="male">mann
			<input id="kjonn2" name="gender" type="radio" value="female">kvinne
			     
			<br><br><button type="submit">Meld meg på</button>
		</fieldset>
	</form>


</body></html>