package debug;

import analysis.ExtractDB;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("Listing des Player : ");
		System.out.println(ExtractDB.getAllPlayers());
		
		System.out.println("Listing des Event : ");
		System.out.println(ExtractDB.getAllEvents());
	}

}

