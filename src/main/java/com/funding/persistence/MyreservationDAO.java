package com.funding.persistence;

import java.util.List;

import com.funding.domain.MyreservationVO;

public interface MyreservationDAO {
	
	public List<MyreservationVO> GetMyres(int m_num);
	
	public void delectFunding(int m_num) throws Exception;
	
	public List<MyreservationVO> myPayment(int m_num);
}
