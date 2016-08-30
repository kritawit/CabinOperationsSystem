package com.bangkokair.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.bangkokair.model.Authorities;
import com.bangkokair.service.AuthoritiesService;

@Controller
@SessionAttributes({"roles"})
public class HomeController {

	@Autowired
	private AuthoritiesService authoritiesService;

	@ModelAttribute("roles")
	public List<Authorities> initializeAuthorities() {
		return authoritiesService.findAll();
	}

	
	private String getPrincipal() {

		String userName = null;
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		if (principal instanceof UserDetails) {
			userName = ((UserDetails) principal).getUsername();
		} else {
			userName = principal.toString();
		}

		return userName;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "home";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout, Model model) {

		if (error != null) {
			model.addAttribute("error", "Invalid username and password.");
		}

		if (logout != null) {
			model.addAttribute("logout", "You have been logged out successfully.");
		}

		return "login";
	}

	@RequestMapping(value = "/Access_Denied", method = RequestMethod.GET)
	public String accessDeniedPage(Model model) {
		model.addAttribute("loggedinuser", getPrincipal());
		return "accessDenied";
	}


}
