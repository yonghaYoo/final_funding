package com.funding.service.member;

import java.util.List;

import com.funding.domain.MemberVO;


public interface MemberService {

	public List<MemberVO> ListMember(int m_num);
	
	public MemberVO InfoMember(int m_num);
	
}
