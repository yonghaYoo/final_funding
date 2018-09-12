package com.funding.dto;

import java.io.Serializable;

public class MemberDTO implements Serializable{
	private String m_id;
	private String m_pw;
	
	public MemberDTO(){}

	public MemberDTO(String m_id, String m_pw) {
		super();
		this.m_id = m_id;
		this.m_pw = m_pw;
	}

	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public String getM_pw() {
		return m_pw;
	}
	public void setM_pw(String m_pw) {
		this.m_pw = m_pw;
	};
}
