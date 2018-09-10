package com.funding.persistence.reward;

import java.util.List;

import com.funding.domain.RewardVO;

public interface rewardDAO {
	
	public List<RewardVO> DetailRewardList(int c_num);
	
	public void  InsertReward(RewardVO reward);
}
