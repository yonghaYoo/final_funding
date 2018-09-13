package com.funding.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.funding.domain.RewardVO;
import com.funding.service.reward.RewardService;

@Controller
@RequestMapping("/Reward")
public class RewardController {

	@Inject
	private RewardService service;
	
	@RequestMapping(value="/AddReward", method=RequestMethod.POST)
	public void InsertReward(RewardVO reward){
		System.out.println("digh");
		
		System.out.println(reward.getR_price());
		service.InsertReward(reward);
	}
	
	
}
