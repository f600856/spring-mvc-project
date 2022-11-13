
function checkPassword(event) {
	const validity = event.target.validity; 
    if (validity.patternMismatch) { 
        const value = event.target.value;
        
        const characterMatchRegex = /[a-zA-Z]/g;
        const containsCharacters = characterMatchRegex.test(value);
        
        const numberMatchRegex = /[0-9]/g;
        const containsNumbers = numberMatchRegex.test(value);
        
        if (!containsCharacters || !containsNumbers) {
			event.target.classList.add("mediumPassword");
		} else {
			event.target.classList.remove("mediumPassword");
		}
		event.target.setCustomValidity("");
    } else {
		event.target.setCustomValidity("Must be at least 5 characters!");
	}
    
    doPasswordsMatch();
}

function doPasswordsMatch() {
	const mainPassword = document.getElementById("password");
	const repeatPassword = document.getElementById("passordRepetert"); 
	
	if (mainPassword.value !== repeatPassword.value) {
		repeatPassword.setCustomValidity("Passwords do not match!"); 	
	} else {
		repeatPassword.setCustomValidity(""); 
	}
}

