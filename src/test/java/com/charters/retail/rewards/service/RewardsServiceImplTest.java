package com.charters.retail.rewards.service;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.charters.retail.rewards.DTO.RewardsDTO;
import com.charters.retail.rewards.entity.RewardsEntity;
import com.charters.retail.rewards.repository.RewardsRepository;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class RewardsServiceImplTest {
	
	@Mock
	RewardsRepository rewardsRepository;
	
	@InjectMocks
	RewardsServiceImpl rewardsService = new RewardsServiceImpl();
	
	@Test
	public void testGetRewards() {
		RewardsEntity entity = new RewardsEntity();
		entity.setAmount(10.00);
		entity.setId(1);
		entity.setRewardPoints(2.00);
		Mockito.when(rewardsRepository.getById(Mockito.anyInt())).thenReturn(entity);
		RewardsDTO response = rewardsService.getRewards(1);
		assertTrue(response.getAmount() == 10.00);
	}
	
}
