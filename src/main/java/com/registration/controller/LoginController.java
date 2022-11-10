package com.registration.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.registration.model.User;
import com.registration.repository.UserRepository;
import com.registration.util.LoginUtil;


@Controller
public class LoginController {
	@Autowired
	UserRepository userRepo;
	
	@GetMapping("/login")
	public String viewLoginPage() {
		return "login";
	}
	
	@PostMapping("/login")
    public String logIn(@RequestParam String mobile, @RequestParam String password,
    		HttpServletRequest request,	RedirectAttributes ra) {
		
		if (!userRepo.existsById(mobile)) {
			ra.addFlashAttribute("redirectMessage", "No user exists for given number!");
            return "redirect:login";
		}
		
		User user = userRepo.getReferenceById(mobile);
		if (!LoginUtil.isCredentialsValid(user, password)) {
			ra.addFlashAttribute("redirectMessage", "Password invalid");
			return "redirect:login";
		}
		
		LoginUtil.login(request, mobile);
		

		request.getSession().setAttribute("user", user);
		
		return "redirect:registered";
		
	}

}
