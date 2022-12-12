package com.charters.retail.rewards.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Rewards")
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class RewardsEntity implements Serializable 
{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@JsonProperty
	private int id;
	
	@JsonProperty
	@Column(name="date_time")
	private Timestamp dateTime;
	
	@JsonProperty
	@Column(name="amount")
	private double amount;
	
	@JsonProperty
	@Column(name="reward_points")
	private double rewardPoints;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getDateTime() {
		return dateTime;
	}

	public void setDateTime(Timestamp dateTime) {
		this.dateTime = dateTime;
	}

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
