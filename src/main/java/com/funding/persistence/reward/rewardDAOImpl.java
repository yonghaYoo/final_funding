package com.funding.persistence.reward;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.funding.domain.RewardVO;


@Repository
public class rewardDAOImpl implements rewardDAO {

	@Inject
	private SqlSession session;
	
	private static String namespace = "com.funding.mappers.rewardMapper";
	
	@Override
	public List<RewardVO> DetailRewardList(int c_num) {
		return session.selectList(namespace + ".DetailRewardList" , c_num);
	}

	@Override
	public void InsertReward(RewardVO reward) {
		session.insert(namespace + ".InsertReward", reward);
	}

}
