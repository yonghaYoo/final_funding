package com.funding.controller;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.funding.domain.ContentsVO;
import com.funding.domain.RewardVO;
import com.funding.persistence.contents.ContentsDAO;
import com.funding.persistence.reward.RewardDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})

public class DetailRewardTest {
	@Inject
	ContentsDAO dao;
	@Inject
	RewardDAO dao2;
	
	
	@Test
	public void Test(){
		int c_num = 2004;
		ContentsVO con = dao.DetailContents(c_num);
		
		List<RewardVO> list = dao2.DetailRewardList(c_num);
		
		System.out.println(con.getC_title());
		
		System.out.println(list.get(1).getR_title());
		
	}
	
}
