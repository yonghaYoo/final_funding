package com.funding.controller;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.funding.domain.ContentsVO;
import com.funding.persistence.contents.ContentsDAO;
import com.funding.service.contents.ContentsService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})

public class DetailTest {
	
	@Inject
	private ContentsDAO dao;
	
	
	@Test
	public void Detail(){
		int c_num =2004;
		ContentsVO con = new ContentsVO();
		con = dao.DetailContents(c_num);
		
		System.out.println(con.getC_title());
	}

}
