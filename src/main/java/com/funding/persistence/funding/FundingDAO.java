package com.funding.persistence.funding;

import com.funding.domain.FundingVO;

public interface FundingDAO {

	public void InsertReFunding(FundingVO funding);
	
	public FundingVO Myfunding(int m_num);
	
	
	
}
