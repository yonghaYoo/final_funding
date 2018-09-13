package com.funding.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.funding.domain.MyreservationVO;

@Repository
public class MyreservationDAOImpl implements MyreservationDAO {
	
	@Inject
	private SqlSession session;
	
	private static String namespace="com.funding.mappers.myreservationMapper";

	@Override
	public List<MyreservationVO> GetMyres(int m_num) {
		return session.selectOne(namespace + ".getMyres", m_num);
	}
	
	

}
