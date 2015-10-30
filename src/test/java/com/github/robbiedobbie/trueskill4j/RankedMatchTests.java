package com.github.robbiedobbie.trueskill4j;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RankedMatchTests{

	@Test
	public void testMatch1v1() {
		Player<Integer> player1 = new Player<Integer>(1);
		Player<Integer> player2 = new Player<Integer>(2);
		
		TrueSkillRanking ranking = TrueSkillRanking.builder()
				.drawProbability(0.1)
				.beta(25.0/6.0)
				.conservativeEstimateRatio(3.0)
				.dynamicsFactor(25.0/300.0)
				.build();

		ranking.addPlayer(player1);
		ranking.addPlayer(player2);

		System.out.println("Player1: " + player1.getRating());
		System.out.println("Player2: " + player2.getRating());

		ranking.addMatchData(Arrays.asList(new Tuple<Rankable<Player<Integer>>, Integer>(player1, 1), new Tuple<Rankable<Player<Integer>>, Integer>(player2, 2)));

		System.out.println("Player1: " + player1.getRating());
		System.out.println("Player2: " + player2.getRating());
	}

}