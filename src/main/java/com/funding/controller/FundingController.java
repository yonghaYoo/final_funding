package com.funding.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.funding.domain.ContentsVO;
import com.funding.domain.FundingVO;
import com.funding.domain.RewardVO;
import com.funding.service.contents.ContentsService;
import com.funding.service.funding.FundingService;
import com.funding.service.reward.RewardService;

@Controller
@RequestMapping("/Funding")
public class FundingController {
	
	@Inject
	private ContentsService con_service;
	
	@Inject
	private RewardService re_service;
	
	@Inject
	private FundingService fun_service;
	
	@RequestMapping(value="/FundingPage",method=RequestMethod.GET)
	public void FundingPage(@RequestParam("c_num") int c_num, Model model){
		ContentsVO contents = new ContentsVO();
		
		contents = con_service.DetailContents(c_num);
		
		List<RewardVO> list = new ArrayList<RewardVO>();
		
		list = re_service.DetailRewardList(c_num);
		
		model.addAttribute("list", list);
		model.addAttribute("Contents", contents);
		
	}
	
	@RequestMapping(value="/FundingPage",method=RequestMethod.POST)	//post
	public String FundingPage(FundingVO funding){
		
		fun_service.InsertReFunding(funding);
		
		return "a";
	}
	
}
