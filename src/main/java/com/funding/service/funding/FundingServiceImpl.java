package com.funding.service.funding;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.funding.domain.FundingVO;
import com.funding.persistence.funding.FundingDAO;

@Service
public class FundingServiceImpl implements FundingService {
	
	@Inject
	private FundingDAO dao;
	
	@Override
	public void InsertReFunding(FundingVO funding) {
		dao.InsertReFunding(funding);
	}

}
