package com.registration.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.registration.util.LoginUtil;

@Controller
public class LogoutController {

	@PostMapping("/logout")
    public String logout(HttpServletRequest request) {
		LoginUtil.logout(request.getSession());
		return "redirect:login";
	}
}
