package com.registration.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.registration.util.PasswordUtil;

import com.registration.model.User;
import com.registration.repository.UserRepository;
import com.registration.util.InputValidator;
import com.registration.util.LoginUtil;

@Controller
public class RegistrationController {
	@Autowired
	UserRepository userRepo;
	
	@GetMapping("/registration")
	public String viewRegistrationPage() {
		return "registration";
	}
	
	@PostMapping("/registration")
	public String register(
		@RequestParam String firstName,
		@RequestParam String lastName,
		@RequestParam String mobile,
		@RequestParam String password,
		@RequestParam String repeatPassword,
		@RequestParam String gender,
		HttpServletRequest request,
		RedirectAttributes ra
	) {
		boolean isValidData = InputValidator.isValidName(lastName)
				&& InputValidator.isValidName(firstName)
				&& InputValidator.isValidPassword(password, repeatPassword)
				&& InputValidator.isValidGender(gender)
				&& InputValidator.isValidNumber(mobile)
				&& !userRepo.existsById(mobile);

		
		if (!isValidData) {
			ra.addFlashAttribute("error", "Enrollment details invalid!");
			return "redirect:registration";
		}
		
		String salt = PasswordUtil.generateSalt();
		String hash = PasswordUtil.generateHash(password, salt);
		
		User user = new User(mobile, firstName, lastName, gender, salt, hash);
		userRepo.save(user);
			
		LoginUtil.login(request, mobile);
		
		request.getSession().setAttribute("user", user);
		
		return "redirect:registered";
	}
}
