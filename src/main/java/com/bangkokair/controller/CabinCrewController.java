package com.bangkokair.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.bangkokair.model.Authorities;
import com.bangkokair.model.CabinCrew;
import com.bangkokair.service.AuthoritiesService;

@Controller
@RequestMapping(value = "/cabincrew", method = RequestMethod.GET)
@SessionAttributes({ "roles", "cabintitle" })
public class CabinCrewController {

	@Autowired
	private AuthoritiesService authoritiesService;

	@ModelAttribute("roles")
	public List<Authorities> initializeAuthorities() {
		return authoritiesService.findAll();
	}

	@ModelAttribute("cabintitle")
	public List<String> initializeTitle() {
		List<String> cabintitle = new ArrayList<String>();
		cabintitle.add(0, "Mr.");
		cabintitle.add(1, "Ms.");
		cabintitle.add(2, "Mrs.");
		return cabintitle;
	}

	@RequestMapping(value = "/cabincrew-profile", method = RequestMethod.GET)
	public String cabincrewprofile() {

		return "cabincrewprofile";
	}

	@RequestMapping(value = "/cabincrew-register", method = RequestMethod.GET)
	public String cabincrewregister(Model model) {

		CabinCrew cabin = new CabinCrew();

		model.addAttribute("cabin", cabin);

		return "cabincrewregister";
	}
}
