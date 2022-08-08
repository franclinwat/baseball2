package com.sfeir.baseball;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class Team {

	private String name;
	private	String cityLocation;
	private	String stadiumName;
	private Boolean isMajorLeagueTeam;
	private	Set<Player> players;

	public Team(String name, String cityLocation, String stadiumName, Boolean isMajorLeagueTeam) {
		this.name = name;
		this.cityLocation = cityLocation;
		this.stadiumName = stadiumName;
		this.isMajorLeagueTeam = isMajorLeagueTeam;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCityLocation() {
		return cityLocation;
	}



	public String getStadiumName() {
		return stadiumName;
	}



	public Boolean  getIsMajorLeagueTeam() {
		return isMajorLeagueTeam;
	}



	public Set<Player> getPlayers() {
		return players;
	}

	public void setPlayers(Set<Player> players) {
		this.players = players;
	}

	public Set<Player> addAPlayerToATeam(Set<Player> players, Player playerToAdd) {
		// All safe man I know my job
		Set<Player> playersTmp = players == null ? new HashSet<>(): players;
		playersTmp.add(playerToAdd);
		return playersTmp;
	}


	
	public Set<Player> getPitchers(){
		return this.players.stream()
				.filter(Objects::nonNull)
				.filter(player -> "pitcher".equalsIgnoreCase(player.getPosition()))
				.collect(Collectors.toSet());
	}
	
	public Set<Player> getCatchers(){

		return this.players.stream()
				   .filter(Objects::nonNull)
					.filter(player -> "catchers".equalsIgnoreCase(player.getPosition()))
				   .collect(Collectors.toSet());
	}
	
	
	public Set<Player> getInfields(){

		return this.players.stream()
				.filter(Objects::nonNull)
				.filter(player -> "infield".equalsIgnoreCase(player.getPosition()))
				.collect(Collectors.toSet());
	}
	
	public Set<Player> getOutfields(){

		return this.players.stream()
				.filter(Objects::nonNull)
				.filter(player -> "outfield".equalsIgnoreCase(player.getPosition()))
				.collect(Collectors.toSet());
	}
	
	public Set<Player> getDesignatedHitters(){

		return this.players.stream()
				.filter(Objects::nonNull)
				.filter(player -> "designated hitter".equalsIgnoreCase(player.getPosition()))
				.collect(Collectors.toSet());
	}

	@Override
	public String toString() {
		return "Team [name=" + getName() + ", cityLocation=" + getCityLocation() + ", statiumName=" + getStadiumName()
				+ ", isMajorLeagueTeam=" + getIsMajorLeagueTeam() + ", players=" + getPlayers() + " \n]";
	}

}
