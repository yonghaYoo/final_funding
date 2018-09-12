package com.funding.controller;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.funding.persistence.member.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"file:src/main/webapp/WEB-INF/spring/*root-context.xml"})
public class MemberRemoveTest {
	
	@Inject
	private MemberDAO dao;
	
	
	@Test
	public void test() throws Exception {
		
	int m_num = 1008;
	
	dao.Memberdelete(m_num);
	}

}
