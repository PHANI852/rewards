package com.charters.retail.rewards.controller;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.charters.retail.rewards.DTO.RewardsDTO;
import com.charters.retail.rewards.service.RewardsService;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class RewardsControllerTest {
	
	@InjectMocks
	RewardsController controller = new RewardsController();
	
	@Mock
	RewardsService rewardsService;
	
	@Test
	public void testGetRewards() {
		RewardsDTO dto = new RewardsDTO();
		dto.setAmount(120.00);
		dto.setRewardPoints(90.00);
		Mockito.when(rewardsService.getRewards(1)).thenReturn(dto);
		RewardsDTO res = rewardsService.getRewards(1);
		assertTrue(res.getRewardPoints() == dto.getRewardPoints());
	}

}
