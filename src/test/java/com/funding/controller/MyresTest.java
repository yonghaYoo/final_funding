package com.funding.controller;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.funding.domain.MyreservationVO;
import com.funding.persistence.MyreservationDAO;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class MyresTest {

	@Inject
	MyreservationDAO dao;
	
	@Test
	public void test() {
		int m_num = 1001;
		
		List<MyreservationVO> list = new ArrayList<MyreservationVO>();
		
		list = dao.GetMyres(m_num);
		
		System.out.println(list.get(0).getC_title());
		
	}

}
