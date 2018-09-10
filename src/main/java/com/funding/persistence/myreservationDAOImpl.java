package com.funding.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import com.funding.domain.MyreservationVO;

public class myreservationDAOImpl implements myreservationDAO {
	
	@Inject
	private SqlSession session;
	
	private static String namespace="com.funding.mappers.myreservationMapper";
	
	@Override
	public MyreservationVO GetMyres(int m_num) {
		return session.selectOne(namespace + ".getMyres", m_num);
	}

}
