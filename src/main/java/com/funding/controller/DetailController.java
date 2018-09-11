package com.funding.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/Detail")
public class DetailController {
	
	
	@RequestMapping(value="/?{c_num}")
	public void Detail(@RequestParam("c_num") int c_num, Model model) {
		
	}
	
}
