package com.funding.persistence.funding;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.funding.domain.FundingVO;


@Repository
public class FundingDAOImpl implements FundingDAO{
	@Inject
	private SqlSession session;
	
	private static String namespace="com.funding.mappers.fundingMapper";
	
	@Override
	public void InsertReFunding(FundingVO funding) {
		session.insert(namespace + ".InsertReFunding" , funding);
	}

	@Override
	public FundingVO Myfunding(int m_num) {
		return session.selectOne(namespace + ".MyFunding", m_num);
	}



	
	
}
