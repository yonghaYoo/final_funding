package com.funding.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.funding.domain.MemberVO;
import com.funding.domain.MyreservationVO;
import com.funding.service.Myreservation.MyreservationService;
import com.funding.service.member.MemberService;

@Controller
public class MypageController {
	
	@Inject
	private MemberService service;
	
	@Inject
	private MyreservationService myres_service;
	
	@RequestMapping(value="/Mypage",method=RequestMethod.GET)
	public String InfoMember(@RequestParam("m_num") int m_num,Model model){
		
		MemberVO member = new MemberVO();
		List<MyreservationVO> mylist = new ArrayList<MyreservationVO>();
		
		mylist = myres_service.GetMyres(m_num);
		
		member = service.InfoMember(m_num);
		
		model.addAttribute("m_info",member);
		
		model.addAttribute("myres",mylist);
		
		
		return "/Mypage";
	}
	

	@RequestMapping(value="/reMyPage", method=RequestMethod.GET)
	public void reMyInfo(){
		
	}

	@RequestMapping(value="/Mypage", method=RequestMethod.POST)
	public String inforUpdatePOST(MemberVO member, RedirectAttributes rttr) throws Exception{
		service.infoUpdate(member);
		rttr.addFlashAttribute("msg","Success");
		return "redirect:/Mypage";
	}
	
	@RequestMapping(value="/Mypage/memberDelete", method=RequestMethod.GET)
	public String Memberdelete(@RequestParam("m_num") int m_num,RedirectAttributes rttr,HttpServletRequest request) throws Exception{
		service.Memberdelete(m_num);
		
		HttpSession session = request.getSession();
		session.removeAttribute("member");
		
		rttr.addFlashAttribute("delete", "deleteok");
		
		return "redirect:/main/Main";
		
	}
	
	@RequestMapping(value="/Mypage/deleteFunding",method=RequestMethod.GET)
	public String delectFunding(@RequestParam("m_num") int m_num)throws Exception{
		myres_service.delectFunding(m_num);
		
		
		return "/Mypage";
		
	}
	
	@RequestMapping(value="/Mypage/myPayment", method=RequestMethod.GET)
	public String myPament(@RequestParam("m_num") int m_num,Model model)throws Exception{
		
		List<MyreservationVO> myPayment = new ArrayList<MyreservationVO>();
		
		myPayment=myres_service.myPayment(m_num);
		
		model.addAttribute("myPay",myPayment);
		
		return "/Mypage";
		
	}


}

