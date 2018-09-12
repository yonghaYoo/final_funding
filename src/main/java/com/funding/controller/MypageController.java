package com.funding.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.funding.domain.MemberVO;
import com.funding.service.member.MemberService;

@Controller
public class MypageController {
	
	@Inject
	private MemberService service;
	
	@RequestMapping(value="/Mypage",method=RequestMethod.GET)
	public String InfoMember(@RequestParam("m_num") int m_num,Model model){
		
		MemberVO member = new MemberVO();
		
		member = service.InfoMember(m_num);
		
		model.addAttribute("m_info",member);
		
		return "/Mypage";
	}
}
