package com.funding.controller;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.funding.domain.MemberVO;
import com.funding.dto.MemberDTO;
import com.funding.persistence.member.MemberDAO;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class Logintest {
	@Inject
	private MemberDAO dao;
	
	@Test
	public void test() throws Exception {
		MemberDTO dto = new MemberDTO();
		dto.setM_id("dd");
		dto.setM_pw("dd");
		
		MemberVO vo = new MemberVO();
		vo = dao.login(dto);
		
		System.out.println(vo.getM_name());
	}

}
