package com.funding.persistence.contents;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.funding.domain.ContentsVO;
import com.funding.domain.RemDayContentsDTO;


@Repository
public class ContentsDAOImpl implements ContentsDAO {
	
	@Inject
	private SqlSession session;
	
	private static String namespace = "com.funding.mappers.contentsMappers";
	
	@Override
	public List<ContentsVO> AllListContents() {
		return session.selectList(namespace + ".AllListContents");
	}

	@Override
	public ContentsVO DetailContents(int c_num) {

		return session.selectOne(namespace + ".DetailContents", c_num);
	}

	@Override
	public void InsertContents(ContentsVO contents) {
		session.insert(namespace + ".InsertContents" , contents);
	}

	@Override
	public void GoalPerContents(ContentsVO contents) {
		session.update(namespace + ".GoalPerContents", contents);
	}

	@Override
	public void RemDayContents(RemDayContentsDTO dto) {

		session.update(namespace + ".RemDayContents", dto);
	}


	

}
