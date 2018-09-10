package com.funding.persistence.member;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.funding.domain.MemberVO;


@Repository
public class MemberDAOImpl implements MemberDAO {
	
	@Inject
	private SqlSession session;
	
	private static String namespace = "com.funding.mappers.memberMapper";
	
	
	@Override
	public List<MemberVO> ListMember() {
		return session.selectList(namespace + ".listMember");
	}

	@Override
	public MemberVO InfoMember(int m_num) {
		return session.selectOne(namespace + ".infoMember", m_num);
	}

}
