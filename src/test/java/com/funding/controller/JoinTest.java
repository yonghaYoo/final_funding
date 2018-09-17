package com.funding.controller;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.funding.domain.MemberVO;
import com.funding.persistence.member.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})

public class JoinTest {
	@Inject
	private MemberDAO dao;
	
	@Test
	public void testJoin()throws Exception{
		MemberVO member = new MemberVO();
		member.setM_id("m_id");
		member.setM_pw("m_pw");
		member.setM_name("m_name");
		member.setM_pno("m_pno");
		member.setM_email("m_email");
		member.setM_acc("m_acc");
		member.setM_add("m_add");
		
	}
}
