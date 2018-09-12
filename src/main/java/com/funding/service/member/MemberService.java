package com.funding.service.member;

import java.util.List;

import com.funding.domain.MemberVO;

import com.funding.domain.MemberVO;
import com.funding.dto.MemberDTO;

public interface MemberService {

	public List<MemberVO> ListMember(int m_num);

	public MemberVO InfoMember(int m_num);

	public MemberVO login(MemberDTO dto) throws Exception;
	
	public void infoUpdate(MemberVO member) throws Exception;
}
