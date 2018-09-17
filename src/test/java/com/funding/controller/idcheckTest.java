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

public class idcheckTest {
	@Inject
	private MemberDAO dao;
	
	@Test
	public void test() {
		String id = "bhs4645";
		int a = dao.idcheck(id);
		System.out.println(a);
	}

}
