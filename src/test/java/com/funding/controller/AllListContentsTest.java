package com.funding.controller;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.funding.domain.ContentsVO;
import com.funding.persistence.contents.ContentsDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class AllListContentsTest {
	
	@Inject
	private ContentsDAO dao;
	
	@Test
	public void AllListTest(){
		List<ContentsVO> list = new ArrayList<ContentsVO>();
		list = dao.AllListContents();
		
		System.out.println(list.get(2).getC_title());
	}
}
