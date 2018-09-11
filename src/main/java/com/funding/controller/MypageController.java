package com.funding.controller;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.funding.domain.MemberVO;
import com.funding.service.member.MemberService;

@Controller
public class MypageController {

	private MemberService service;
	
	@RequestMapping(value="/Mypage",method=RequestMethod.GET)
	public String InfoMember(@RequestParam("m_num") int m_num){
		
		List<MemberVO> list = new ArrayList<MemberVO>();
		list = service.ListMember(m_num);
		
		return "/Mypage";
	}
}
