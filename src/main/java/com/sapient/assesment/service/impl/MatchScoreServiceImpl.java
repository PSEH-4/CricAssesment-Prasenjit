package com.sapient.assesment.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sapient.assesment.model.MatchDetails;
import com.sapient.assesment.service.MatchScoreService;
import com.sapient.assesment.vo.ResultVO;


@Service
public class MatchScoreServiceImpl implements MatchScoreService{
	
	@Value( "${cricketmatchapikey}" )
	private String cricketmatchapikey;
	
	@Autowired
    private RestTemplate myRestTemplate;
	
	private static final String apiUrl = "https://cricapi.com/api/cricketScore?unique_id=%d&apikey=%s";
	

	@Override
	public ResultVO getMatchScore(Integer uniqueId) {
		
		String serviceInvocationURL = String.format(apiUrl, uniqueId,cricketmatchapikey);
		
		ResponseEntity<MatchDetails> response = myRestTemplate.getForEntity(serviceInvocationURL, MatchDetails.class);
		MatchDetails matchDetails = response.getBody();
		
		
		ResultVO resultVO = new ResultVO();
		
		resultVO.setTeam1(matchDetails.getTeam1());
		resultVO.setTeam2(matchDetails.getTeam2());
		
		
		return resultVO;
	}

}
