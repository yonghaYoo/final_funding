package com.funding.service.reward;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.funding.domain.RewardVO;
import com.funding.persistence.reward.RewardDAO;

@Service
public class RewardServiceImpl implements RewardService {

	@Inject
	private RewardDAO dao;
	
	@Override
	public List<RewardVO> DetailRewardList(int c_num) {
		return dao.DetailRewardList(c_num);
	}

}
