package com.sfeir.baseball;

import java.util.Date;

public class DisplayTheTeamUtils {

	/**
	 * Display my favorite team!
	 * 
	 * @param teamToDisplay
	 */
	public static void displayTheTeam(final Team teamToDisplay) {
		System.out.println("\t\t ===== " + teamToDisplay.getName().toUpperCase() + " =====");
		System.out.println(" ");
		System.out
				.println("I have " + teamToDisplay.getPlayers().size() + " players in my team " + teamToDisplay.getName().toUpperCase());

		System.out.println("\n  == Pitchers == ");
		 teamToDisplay.getPitchers().forEach(p -> System.out.println(p));


		System.out.println("\n == Catchers == ");
		//System.out.println(teamToDisplay.getCatchers());
		teamToDisplay.getCatchers().forEach(p -> System.out.println(p));


		System.out.println(" \n == Infields == ");
		teamToDisplay.getInfields().forEach(p -> System.out.println(p));


		System.out.println(" \n == Outfields == ");
		teamToDisplay.getOutfields().forEach(p -> System.out.println(p));


		System.out.println("\n  == Designated Hitters == ");
		//System.out.println(teamToDisplay.getDesignatedHitters());
		teamToDisplay.getDesignatedHitters().forEach(p -> System.out.println(p));


		System.out.println("\n The hole team is composed of : " + teamToDisplay);


		System.out.println("\n  ===== We will win the season : " + extractYear() + " ===== ");
	}

	/**
	 * Extract the year.
	 * 
	 * @return
	 */
	private static Integer extractYear() {
		// The new date
		Date currentYear = new Date();
		// This getYear is deprecated and returns wrong values! Stupid JAVA!
		// currentYear.getYear();
		String yearTmp = currentYear.toString();
		// Because "CEST 2016" at the end
		String yearCompute = yearTmp.substring(yearTmp.lastIndexOf(' '));
		return Integer.valueOf(yearCompute.trim());

	}
}
