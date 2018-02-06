package com.fifa;

import java.util.HashMap;
import java.util.Map;

public class Game {

	private Map<Team, Integer> goals;

	public Game() {
		super();
		this.goals = new HashMap<>();
	}

	public Map<Team, Integer> getGoals() {
		return goals;
	}

}
