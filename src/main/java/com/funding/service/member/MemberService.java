package com.funding.service.member;

import com.funding.domain.MemberVO;
import com.funding.dto.MemberDTO;

public interface MemberService {
	public MemberVO login(MemberDTO dto)throws Exception;
}
