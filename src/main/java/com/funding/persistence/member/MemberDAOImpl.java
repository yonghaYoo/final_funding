package com.funding.persistence.member;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.funding.domain.MemberVO;
import com.funding.dto.MemberDTO;


@Repository
public class MemberDAOImpl implements MemberDAO {
	
	@Inject
	private SqlSession session;
	
	private static String namespace = "com.funding.mappers.memberMappers";

	@Override
	public MemberVO login(MemberDTO dto) throws Exception {
		return session.selectOne(namespace +".login", dto);
	}
	
	@Override
	public List<MemberVO> ListMember() {
		return session.selectList(namespace + ".listMember");
	}

	@Override
	public MemberVO InfoMember(int m_num) {
		return session.selectOne(namespace + ".infoMember", m_num);
	}

	@Override
	public void join(MemberVO vo) throws Exception {
		session.insert(namespace+".join", vo);	
	}

	
	
}
