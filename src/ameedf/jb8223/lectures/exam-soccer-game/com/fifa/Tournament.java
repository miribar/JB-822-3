package com.fifa;

import java.util.ArrayList;
import java.util.List;

public class Tournament {
	private List<Game> games;
	private List<Team> teams;

	public Tournament() {
		super();
		this.games = new ArrayList<>();
		this.teams = new ArrayList<>();
	}

	public List<Game> getGames() {
		return games;
	}

	public void setGames(List<Game> games) {
		this.games = games;
	}

	public List<Team> getTeams() {
		return teams;
	}

	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}

}
