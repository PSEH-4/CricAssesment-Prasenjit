package com.sapient.assesment.model;

import com.fasterxml.jackson.annotation.JsonSetter;

public class MatchDetails {
	
	private String stat;
	private String score;
	private String description;
	private boolean matchStarted;
	private String team1;
	private String team2;
	public String getStat() {
		return stat;
	}
	public void setStat(String stat) {
		this.stat = stat;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "MatchDetails [stat=" + stat + ", score=" + score + ", description=" + description + ", matchStarted="
				+ matchStarted + ", team1=" + team1 + ", team2=" + team2 + "]";
	}
	public boolean isMatchStarted() {
		return matchStarted;
	}
	public void setMatchStarted(boolean matchStarted) {
		this.matchStarted = matchStarted;
	}
	public String getTeam1() {
		return team1;
	}
	
	@JsonSetter("team-1")
	public void setTeam1(String team1) {
		this.team1 = team1;
	}
	public String getTeam2() {
		return team2;
	}
	
	@JsonSetter("team-2")
	public void setTeam2(String team2) {
		this.team2 = team2;
	}

}
