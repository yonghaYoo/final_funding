package com.funding.persistence;

import java.util.List;

import com.funding.domain.MyreservationVO;

public interface MyreservationDAO {
	
	public List<MyreservationVO> GetMyres(int m_num);
	
}
