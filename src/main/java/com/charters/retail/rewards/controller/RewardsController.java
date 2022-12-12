package com.charters.retail.rewards.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.charters.retail.rewards.DTO.RewardsDTO;
import com.charters.retail.rewards.service.RewardsService;

@RestController
@RequestMapping("/rewards")
public class RewardsController {
	
	@Autowired
	RewardsService service;
	
	@GetMapping("/{id}")
	public RewardsDTO getRewards(@PathVariable("id") Integer id)
	{
		System.out.println("In Controller - " + id);
		return service.getRewards(id);
	}
	
	@GetMapping()
	public List<RewardsDTO> getAllRewards()
	{
		return service.getAllRewards();
	}
	
	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> saveRewards(@RequestBody RewardsDTO request)
	{
		service.saveRewards(request);
		return new ResponseEntity<>("Transaction saved successfully", HttpStatus.OK);
	}
	

}
