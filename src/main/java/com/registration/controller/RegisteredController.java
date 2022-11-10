package com.registration.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.registration.util.LoginUtil;

@Controller
public class RegisteredController {
	@GetMapping("/registered")
	public String viewRegisteredPage(HttpSession session, RedirectAttributes ra) {
		if (!LoginUtil.isLoggedIn(session)) {
            ra.addFlashAttribute("redirectMessage", "Login Required");
            return "redirect:login";
        }
		return "registered";
	}
}
