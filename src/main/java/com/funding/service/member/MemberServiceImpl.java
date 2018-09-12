package com.funding.service.member;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.funding.domain.MemberVO;
import com.funding.dto.MemberDTO;
import com.funding.persistence.member.MemberDAO;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Inject
	private MemberDAO dao;

	@Override
	public MemberVO login(MemberDTO dto) throws Exception {
		return dao.login(dto);
	}

}
