package com.charters.retail.rewards.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.charters.retail.rewards.entity.RewardsEntity;

@Repository
public interface RewardsRepository extends JpaRepository<RewardsEntity, Integer>
{

}
