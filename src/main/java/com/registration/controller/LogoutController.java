package com.registration.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.registration.util.LoginUtil;

@Controller
public class LogoutController {

	@PostMapping("/logout")
    public String logout(HttpServletRequest request, RedirectAttributes ra) {
		LoginUtil.logout(request.getSession());
		ra.addFlashAttribute("logoutMessage","you are loged out");
		
	    return "redirect:login";
	}
	
		
	
}
