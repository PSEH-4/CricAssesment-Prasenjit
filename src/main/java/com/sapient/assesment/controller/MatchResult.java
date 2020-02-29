package com.sapient.assesment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.assesment.service.MatchScoreService;
import com.sapient.assesment.vo.ResultVO;

@RestController
public class MatchResult {
	
	@Autowired
	private MatchScoreService matchScoreService;
	
	
	@RequestMapping("/result/match/{id}")
	public ResultVO getStandings(@PathVariable int id) {
		return matchScoreService.getMatchScore(id);
	}

}
