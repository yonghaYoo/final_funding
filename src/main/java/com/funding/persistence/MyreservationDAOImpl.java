package com.funding.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.funding.domain.MyCompleteContentsVO;
import com.funding.domain.MyreservationVO;

@Repository
public class MyreservationDAOImpl implements MyreservationDAO {
	
	@Inject
	private SqlSession session;
	
	private static String namespace="com.funding.mappers.myreservationMapper";

	@Override
	public List<MyreservationVO> GetMyres(int m_num) {
		return session.selectList(namespace + ".getMyres", m_num);
	}

	@Override
	public void delectFunding(int m_num) throws Exception {
		session.delete(namespace + ".delectFunding",m_num);
	}

	@Override
	public List<MyreservationVO> myPayment(int m_num) {
		return session.selectList(namespace +".myPayment",m_num);
	}

	@Override
	public List<MyCompleteContentsVO> myCompleteContents(int m_num) {
		return session.selectList(namespace + ".myCompleteContents", m_num);
	}

	


	
	

}
