package com.funding.persistence.member;

import java.util.List;


import com.funding.domain.MemberVO;
import com.funding.dto.MemberDTO;

public interface MemberDAO {
	
	public MemberVO login(MemberDTO dto)throws Exception;
	
	public List<MemberVO> ListMember();
	
	public MemberVO InfoMember(int m_num);
	

	public void join(MemberVO vo)throws Exception;

	public int idcheck(String m_id);
	

	public void infoUpdate(MemberVO vo) throws Exception;
	
	public void Memberdelete(int m_num) throws Exception;

}
