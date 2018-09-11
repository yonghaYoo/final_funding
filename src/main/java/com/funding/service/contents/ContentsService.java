package com.funding.service.contents;

import java.util.List;

import com.funding.domain.ContentsVO;

public interface ContentsService {
	public List<ContentsVO> AllListContents();
	
	public ContentsVO Detail(int c_num);
}
