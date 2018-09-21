package com.funding.persistence.contents;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.funding.domain.ContentsVO;
import com.funding.domain.RemDayContentsDTO;

public interface ContentsDAO {
	
	public List<ContentsVO> AllListContents();
	
	public ContentsVO DetailContents(int c_num);
	
	public void InsertContents(ContentsVO contents);
	
	public void GoalPerContents(ContentsVO contents);
	
	public void RemDayContents(RemDayContentsDTO dto);
	
}
