package com.funding.persistence.member;

import java.util.List;

import com.funding.domain.MemberVO;

public interface MemberDAO {
	
	public List<MemberVO> ListMember();
	
	public MemberVO InfoMember(int m_num);
	
}
