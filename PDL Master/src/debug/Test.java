package debug;

import java.util.ArrayList;

import analysis.ExtractDB;
import classes.Event;
import classes.Opening;
import classes.Player;
import tools.StopWatch;

public class Test {

	public static void main(String[] args) {
		
		StopWatch timer = new StopWatch();
		
		ArrayList<Player> allPlayers = ExtractDB.getAllPlayers();
		ArrayList<Event> allEvents = ExtractDB.getAllEvents();
		ArrayList<Opening> allOpenings = ExtractDB.getAllOpenings();
		
		System.out.println("Nombre de joueurs : " + allPlayers.size());
		System.out.println("Nombre d'evènements : " + allEvents.size());
		System.out.println("Nombre d'ouvertures : " + allOpenings.size());
		
		System.out.println("Temps d'exécution : " + timer.elapsedTime() + " sec.");
		
		
	}
}