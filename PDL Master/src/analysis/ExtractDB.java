package analysis;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import classes.Event;
import classes.Player;
import mysql.MySQL;

public class ExtractDB {
	
	/**
	 * Retourne un ArrayList de Player contenant tous les joueurs de la BDD
	 * @return ArrayList<Player>
	 */
	public static ArrayList<Player> getAllPlayers(){
		ArrayList<Player> allPlayers = new ArrayList<Player>();
		String query = "SELECT * FROM Player";
		try {
			ResultSet rs = MySQL.getInstance().query(query);
			while(rs.next()){
				allPlayers.add(new Player(rs.getInt(1), rs.getString(2)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return allPlayers;
	}
	
	/**
	 * Retourne un ArrayList d'Event contenant tous les évènements de la BDD
	 * @return ArrayList<Event>
	 */
	public static ArrayList<Event> getAllEvents(){
		ArrayList<Event> allEvents = new ArrayList<Event>();
		String query = "SELECT * FROM Event";
		try {
			ResultSet rs = MySQL.getInstance().query(query);
			while(rs.next()){
				allEvents.add(new Event(rs.getInt(1), rs.getString(2), rs.getString(3)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return allEvents;
	}
	
}
