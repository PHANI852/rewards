package com.charters.retail.rewards.service;

import java.util.List;

import com.charters.retail.rewards.DTO.RewardsDTO;
import com.charters.retail.rewards.entity.RewardsEntity;

public interface RewardsService {

	public RewardsDTO getRewards(Integer id);
	
	public List<RewardsDTO> getAllRewards();
	
	public RewardsEntity saveRewards(RewardsDTO request);
}
