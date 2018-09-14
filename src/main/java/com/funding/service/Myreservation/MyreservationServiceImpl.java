package com.funding.service.Myreservation;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.funding.domain.MyreservationVO;
import com.funding.persistence.MyreservationDAO;

@Service
public class MyreservationServiceImpl implements MyreservationService {

	@Inject
	private MyreservationDAO dao;
	
	@Override
	public List<MyreservationVO> GetMyres(int m_num) {
		 
		return dao.GetMyres(m_num);
	}

	@Override
	public void delectFunding(int m_num) throws Exception {
		dao.delectFunding(m_num);
		
	}

	@Override
	public List<MyreservationVO> myPayment(int m_num) {
		
		return dao.myPayment(m_num);
	}
	
	

}
