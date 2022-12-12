package com.charters.retail.rewards.DTO;

import java.io.Serializable;

import lombok.Data;

public class RewardsDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private double amount;
	
	private double rewardPoints;
	
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getRewardPoints() {
		return rewardPoints;
	}

	public void setRewardPoints(double rewardPoints) {
		this.rewardPoints = rewardPoints;
	}
	
}
