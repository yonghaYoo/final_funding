package com.funding.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.funding.domain.RewardVO;
import com.funding.service.contents.ContentsService;
import com.funding.service.reward.RewardService;


@Controller
public class DetailController {

	@Inject
	private ContentsService con_service;
	
	@Inject
	private RewardService re_service;
	
	@RequestMapping(value="/Detail",method=RequestMethod.GET)
	public String Detail(@RequestParam("c_num") int c_num, Model model) {
		model.addAttribute("Contents", con_service.DetailContents(c_num));
		
		List<RewardVO> list = new ArrayList<RewardVO>();
		list = re_service.DetailRewardList(c_num);
		
		model.addAttribute("list2", list);
		
		return "Detail";
	}
	
}
