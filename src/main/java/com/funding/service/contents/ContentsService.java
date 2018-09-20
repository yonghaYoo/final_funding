package com.funding.service.contents;

import java.util.List;

import com.funding.domain.ContentsVO;
import com.funding.dto.ContentDTO;


public interface ContentsService {
	public List<ContentsVO> AllListContents();

	public ContentsVO DetailContents(int c_num);
	
	public void InsertContents(ContentsVO contents);
}
