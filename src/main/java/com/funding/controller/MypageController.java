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

import com.funding.domain.ContentsVO;
import com.funding.domain.MemberVO;
import com.funding.domain.MyCompleteContentsVO;
import com.funding.domain.MyreservationVO;
import com.funding.domain.RewardVO;
import com.funding.service.Myreservation.MyreservationService;
import com.funding.service.contents.ContentsService;
import com.funding.service.member.MemberService;
import com.funding.service.reward.RewardService;

@Controller
public class MypageController {
	
	@Inject
	private MemberService service;
	
	@Inject
	private MyreservationService myres_service;
	
	@Inject
	private ContentsService con_service;
	
	
	@Inject
	private RewardService re_service;
	
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
	public void reMyInfo(HttpServletRequest request,Model model){
		
		//세션데이터 가져오기
		HttpSession session = request.getSession();
		
		MemberVO member = (MemberVO)session.getAttribute("member");
		/*int c_num = (int)session.getAttribute("c_num");*/
		
		int m_num = member.getM_num();
		int c_num = member.getC_num();
		
		//내 예약 목록.
		List<MyreservationVO> myreslist = new ArrayList<MyreservationVO>();
		myreslist = myres_service.GetMyres(m_num);
		
		
		model.addAttribute("myReslist",myreslist);
		
		//내 결제 목록.
		List<MyreservationVO> myPayment = new ArrayList<MyreservationVO>();
		
		myPayment=myres_service.myPayment(m_num);
		
		model.addAttribute("myPaylist",myPayment);
		
		//내 컨텐츠.
		ContentsVO mycontents = new ContentsVO();
		
		mycontents = con_service.DetailContents(c_num);
		
		model.addAttribute("mycontents", mycontents);
		
		//내 컨텐츠 리워드
		List<RewardVO> rewardList = new ArrayList<RewardVO>();
		
		rewardList = re_service.DetailRewardList(c_num);
		model.addAttribute("re_list", rewardList);
		
		
		//완료된 컨텐츠
		List<MyCompleteContentsVO> myCompleteContents = new ArrayList<MyCompleteContentsVO>();
		
		myCompleteContents = myres_service.myCompleteContents(m_num);
		
		model.addAttribute("myCompleteContents",myCompleteContents);
		
		
		
		
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

