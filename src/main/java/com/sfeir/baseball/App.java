package com.sfeir.baseball;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Red Sox the best team ever!
 * <b>Yankees Sucks</b>
 * 
 * Fun Jokes: 
 * <p><b>Q:</b> What's the difference between dirt and the New York Yankees?<br> 
 * <b>A:</b> Nothing...they both always get swept.</p>
 * 
 *  
 * <p><b>Q:</b> What is the difference between a Yankees fan and a baby?
 * <b>A:</b> The baby will stop whining after a while. </p>
 */
public class App {
	static String MLB_LOGO;
	static {

		MLB_LOGO = "               Boston  Red Sox Baseball  Boston   Red Sox  Baseball \n"
				+ "              BA                            SEB                   A \n"
				+ "              LL                   S.F.Gia    BAS                 EB \n"
				+ "              AL                  LBoston\"    A\'s                 \"B \n"
				+ "              AS                 EBALLS.F.G      ia               nt \n"
				+ "              sB                  ASEBALLS.       F.G             ia \n"
				+ "              BA                   SEBALLOakland\"A\'s\"B            AS \n"
				+ "              EB                 ALLS.F.GiantsBASEBALLS.          F. \n"
				+ "              Gi   aBA          SEBALLOakland\"A\'s\"BASEBALL        S. \n"
				+ "              F.   Gia         ntsBASEBALLS.F.GiaBASEBALLO        ak \n"
				+ "               l                 and\"A\'s\"BASEBALLS.F.             Gi \n"
				+ "                a                ntsBASEBALLS.F.GiaBA            S\n"
				+ "                 S.F. Giants Baseball S.F. Giants Baseball'";
	}

	public static void main(String[] args) {



		// David Ortiz
		Player davidOrtiz = new Player("Ortiz","David","Designated Hitter");
		// David Price
		Player davidPrice = new Player("Price","David","Pitcher");
		// David Wells
		Player davidWells = new Player("Wells","David","Pitcher");

		// R
		Team redSox = new Team("Red Sox", "Boston", "Fenway Park", true);

		// Add David Price, David Ortiz and David Wells
		// We had such a great team now two super famous pitchers! We gonna win
		// the MLB.
		Set<Player> allPlayers1 = redSox.addAPlayerToATeam(redSox.getPlayers(), davidOrtiz);
		//System.out.println( allPlayers1);
		Set<Player>  allPlayers2 = redSox.addAPlayerToATeam(allPlayers1, davidPrice);
		//System.out.println( allPlayers2);
		Set<Player>  allPlayers3 = redSox.addAPlayerToATeam(allPlayers2, davidWells);

		redSox.setPlayers(allPlayers3);


		// Set the team to the player
		davidPrice.setCurrentTeam(redSox);
		davidOrtiz.setCurrentTeam(redSox);
		davidWells.setCurrentTeam(redSox);
		//System.out.println(allPlayers1);
		//TODO: Add Jhon Farrell as a Manager?! How can I do that? Java Is so complicated

		System.out.println(MLB_LOGO);
		System.out.println(" ");

		DisplayTheTeamUtils.displayTheTeam(redSox);
	}
}
