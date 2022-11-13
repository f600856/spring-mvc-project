package com.registration.tests;

import com.registration.util.InputValidator;
import com.registration.util.PasswordUtil;

import org.junit.jupiter.api.*;

public class UnitTests {
	@Test
    public void inputValidation() {
		Assertions.assertTrue(InputValidator.isValidGender("male"));
		Assertions.assertTrue(InputValidator.isValidGender("female"));
		Assertions.assertFalse(InputValidator.isValidGender("invalid"));
		
		Assertions.assertTrue(InputValidator.isValidPassword("pass1", "pass1"));
		Assertions.assertFalse(InputValidator.isValidPassword("pass1", "pass2"));
		Assertions.assertFalse(InputValidator.isValidPassword("sh", "sh"));
		
		Assertions.assertTrue(InputValidator.isValidName("abcd"));
		Assertions.assertFalse(InputValidator.isValidName("f"));
		Assertions.assertFalse(InputValidator.isValidName("abcnjncbhcjbfhbfhjbfhj"));
	
    }
	@Test
    public void passwordValidation() {
		String pass = "abc";
		String salt = PasswordUtil.generateSalt();
		String hash1=  PasswordUtil.generateHash(pass,salt);
		Assertions.assertTrue(PasswordUtil.isCredentialsValid(hash1, salt, "abc"));
		Assertions.assertFalse(PasswordUtil.isCredentialsValid(hash1, salt, "bdhf"));
		
	}
}

