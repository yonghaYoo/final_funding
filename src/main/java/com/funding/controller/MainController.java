package com.funding.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.funding.domain.ContentsVO;
import com.funding.service.contents.ContentsService;

@Controller
@RequestMapping("/main")
public class MainController {

	@Inject
	private ContentsService service;
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public String Main(Model model){
		List<ContentsVO> list = new ArrayList<ContentsVO>();
		
		list = service.AllListContents();
		
		model.addAttribute("list", list);
		
		return "/main/Main";
	}
	
}
