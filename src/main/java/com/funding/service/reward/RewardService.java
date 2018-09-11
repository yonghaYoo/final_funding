package com.funding.service.reward;

import java.util.List;

import javax.inject.Inject;

import com.funding.domain.RewardVO;

public interface RewardService {

	public List<RewardVO> DetailRewardList(int c_num);
}
