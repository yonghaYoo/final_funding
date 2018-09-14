package com.funding.service.member;

import java.util.List;

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
	public List<MemberVO> ListMember(int m_num) {
		return dao.ListMember();
	}

	@Override
	public MemberVO InfoMember(int m_num) {
		return dao.InfoMember(m_num);

	}

	@Override
	public MemberVO login(MemberDTO dto) throws Exception {
		return dao.login(dto);
	}
	
	@Override
	public void infoUpdate(MemberVO member) throws Exception{
		dao.infoUpdate(member);
	}

	@Override
	public void Memberdelete(int m_num) throws Exception {
		dao.Memberdelete(m_num);
	}


	
}
