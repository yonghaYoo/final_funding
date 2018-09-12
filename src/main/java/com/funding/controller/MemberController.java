package com.funding.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.funding.domain.MemberVO;
import com.funding.dto.MemberDTO;
import com.funding.service.member.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	@Inject
	private MemberService service;
	
	@RequestMapping(value="/login", method= RequestMethod.GET)
	public void loginGET(@ModelAttribute("dto") MemberDTO dto){
		
	}
	
	@RequestMapping(value="/loginPost", method = RequestMethod.POST)
	public void loginPOST(MemberDTO dto, HttpSession session, Model model)throws Exception{
		
		MemberVO vo = service.login(dto);
		
		if(vo==null){
			return ;
		}
		
		model.addAttribute("member", vo);
		
	}
	
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public String logout(HttpServletRequest request, HttpServletResponse response,
						HttpSession session)throws Exception{
		Object obj = session.getAttribute("member");
		
		if(obj != null){
			MemberVO vo = (MemberVO) obj;
			
			session.removeAttribute("member");
			session.invalidate();
		}
		
		return "member/logout";
	}
	
}
