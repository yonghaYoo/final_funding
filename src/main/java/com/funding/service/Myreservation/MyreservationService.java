package com.funding.service.Myreservation;

import java.util.List;

import com.funding.domain.MyCompleteContentsVO;
import com.funding.domain.MyreservationVO;

public interface MyreservationService {

	public List<MyreservationVO> GetMyres(int m_num);

	public void delectFunding(int m_num) throws Exception;

	public List<MyreservationVO> myPayment(int m_num);

	public List<MyCompleteContentsVO> myCompleteContents(int m_num);
}