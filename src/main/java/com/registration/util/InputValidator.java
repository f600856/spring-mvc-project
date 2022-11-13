package com.registration.util;

public class InputValidator {

		public static boolean isNotEmpty(String val) {
			return val != null && !val.isEmpty();
		}
		
	    public static boolean isValidName(String name) {
	    	if (!InputValidator.isNotEmpty(name)) return false;  
	    	
	    	return name.length() >= 2 && name.length() <= 20;
	    }
	    
	    public static boolean isValidPassword(String pass, String repeat) {
	        if (!InputValidator.isNotEmpty(pass)) return false; 
	        
	        if (pass.length() < 5) return false;
	        
	        return pass.equals(repeat);
	    }
	    
	    public static boolean isValidNumber(String number) {
	        return InputValidator.isNotEmpty(number);        
	    }

	    public static boolean isValidGender(String gender) {
	        return gender.equals("male") || gender.equals("female");        
	    }
}
