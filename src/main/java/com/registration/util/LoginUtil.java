package com.registration.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.registration.model.User;

public class LoginUtil {
	private final static int MAX_INTERACTIVE_INTERVAL = 60;
	
	

	public static void logout(HttpSession session) {
        session.invalidate();
	}

	public static void login(HttpServletRequest request, String mobile) {
		logout(request.getSession());
		HttpSession session = request.getSession();	
        session.setMaxInactiveInterval(MAX_INTERACTIVE_INTERVAL);
        session.setAttribute("mobile", mobile);
	}
	
	public static boolean isLoggedIn(HttpSession session) {
		return session != null && session.getAttribute("mobile") != null;
	}
}

