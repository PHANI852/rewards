package com.charters.retail.rewards.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.charters.retail.rewards.DTO.RewardsDTO;
import com.charters.retail.rewards.entity.RewardsEntity;
import com.charters.retail.rewards.repository.RewardsRepository;


@Service
public class RewardsServiceImpl implements RewardsService{
	
	@Autowired
	RewardsRepository repo;

	@Override
	public RewardsDTO getRewards(Integer id) {
		System.out.println("Start id - " + id);
		RewardsEntity e = repo.getById(id);
		System.out.println("Test - ");
		System.out.println(e);
		RewardsDTO dto = new RewardsDTO();
		BeanUtils.copyProperties(e, dto);
		return dto;
	}
	
	@Override
	public List<RewardsDTO> getAllRewards() {
		List<RewardsEntity> dbList = repo.findAll();
		List<RewardsDTO> responseList = new ArrayList<>();
		for (RewardsEntity entity : dbList)
		{
			RewardsDTO dto = new RewardsDTO();
			BeanUtils.copyProperties(entity, dto);
			responseList.add(dto);
		}
		return responseList;
	}

	@Override
	public RewardsEntity saveRewards(RewardsDTO request) {
		double rewards = 0;
		RewardsEntity entity = new RewardsEntity();
		entity.setDateTime(new Timestamp(System.currentTimeMillis()));
		entity.setAmount(request.getAmount());
		double amount = request.getAmount();
		if (amount > 50 && amount < 101)
		{
			rewards += (amount-50) * 1;
		}
		else if (amount > 100)
		{
			rewards += 50 * 1 + (amount - 100) * 2;
		}
		entity.setRewardPoints(rewards);
		return repo.save(entity);
	}

	
}
