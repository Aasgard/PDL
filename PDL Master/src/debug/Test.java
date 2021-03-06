package debug;

import java.util.ArrayList;

import analysis.ExtractDB;
import classes.Event;
import classes.Move;
import classes.Opening;
import classes.Player;
import tools.StopWatch;

public class Test {

	public static void main(String[] args) {
		
		StopWatch timer = new StopWatch();
		
		ArrayList<Player> allPlayers = ExtractDB.getAllPlayers();
		ArrayList<Event> allEvents = ExtractDB.getAllEvents();
		ArrayList<Opening> allOpenings = ExtractDB.getAllOpenings();
		ArrayList<Move> allMovesFromGame = ExtractDB.getMovesByGame(1);
		
		System.out.println("Nombre de joueurs dans la BDD : " + allPlayers.size());
		System.out.println("Nombre d'ev�nements dans la BDD : " + allEvents.size());
		System.out.println("Nombre d'ouvertures dans la BDD : " + allOpenings.size());
		System.out.println("Nombre de moves de la partie 1 : " + allMovesFromGame.size());
		
		
		System.out.println("Temps d'ex�cution des requ�tes : " + timer.elapsedTime() + " sec.");
		
	}
}