package com.funding.service.member;

import java.util.List;

import javax.inject.Inject;

import com.funding.domain.MemberVO;
import com.funding.persistence.member.MemberDAO;

public class MemberServiceImpl implements MemberService {

	@Inject
	private MemberDAO dao;
	
	@Override
	public List<MemberVO> ListMember(int m_num){
		return dao.ListMember();
	}
	
	

	@Override
	public MemberVO InfoMember(int m_num) {
		return dao.InfoMember(m_num);
	}

}
