package analysis;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import classes.Event;
import classes.FEN;
import classes.Move;
import classes.Opening;
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
	 * Retourne un ArrayList d'Event contenant tous les �v�nements de la BDD
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
	
	/**
	 * Retourne un ArrayList d'Opening contenant tous les ouvertures de parties de la BDD
	 * @return ArrayList<Opening>
	 */
	public static ArrayList<Opening> getAllOpenings(){
		ArrayList<Opening> allOpenings = new ArrayList<Opening>();
		String query = "SELECT o.id, o.opening, o.variation, o.moves, o.nbMoves FROM Opening o";
		try {
			ResultSet rs = MySQL.getInstance().query(query);
			while(rs.next()){
				allOpenings.add(new Opening(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return allOpenings;
	}
	
	public static ArrayList<Move> getMovesByGame(int id){
		ArrayList<Move> allMovesByGame = new ArrayList<Move>();
		String query = "SELECT m.id,m.idGame,m.halfMove,m.move,f.id,f.log FROM Move m, FEN f WHERE m.idFEN = f.id AND idGame = " + id;
		try {
			ResultSet rs = MySQL.getInstance().query(query);
			while(rs.next()){
				allMovesByGame.add(new Move(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), new FEN(rs.getString(5), rs.getString(6))));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return allMovesByGame;
	}
	
}
