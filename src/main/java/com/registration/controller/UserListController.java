package com.registration.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.registration.model.User;
import com.registration.repository.UserRepository;
import com.registration.util.LoginUtil;

@Controller
public class UserListController {
	@Autowired
	UserRepository userRepo;
	
	@GetMapping("/userlist")
	public String viewUserListPage(HttpSession session, RedirectAttributes ra) {
		if (!LoginUtil.isLoggedIn(session)) {
            ra.addFlashAttribute("redirectMessage", "Login Required");
            return "redirect:login";
        }
		
		String mobile = (String) session.getAttribute("mobile");
		User currentUser = userRepo.getReferenceById(mobile);
		List<User> userList = userRepo.findAll();
		System.out.println("userList length " + userList.size());
        session.setAttribute("users", userList);
        session.setAttribute("currentUser", currentUser);
        
		return "userList";
	}
	

}
