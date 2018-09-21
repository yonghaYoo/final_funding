package com.funding.controller;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.funding.domain.MemberVO;
import com.funding.persistence.member.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/root-context.xml" })

public class MypageTast {

	@Inject
	private MemberDAO dao;

	@Test
	public void Mypage() {
		int m_num = 1005;
		MemberVO vo = new MemberVO();
		vo = dao.InfoMember(m_num);

		System.out.println(vo.getM_name());
		System.out.println(vo.getM_email());
		System.out.println(vo.getM_id());
		System.out.println(vo.getM_acc());
	}

}
