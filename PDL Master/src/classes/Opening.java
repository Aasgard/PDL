package classes;

public class Opening {

	private int id;
	private String opening;
	private String variation;
	private String moves;
	private int nbMoves;
	
	public Opening(int id, String opening, String variation, String moves, int nbMoves) {
		super();
		this.id = id;
		this.opening = opening;
		this.variation = variation;
		this.moves = moves;
		this.nbMoves = nbMoves;
	}

	public int getId() {
		return id;
	}
	
	public String getOpening() {
		return opening;
	}
	
	public String getVariation() {
		return variation;
	}
	
	public String getMoves() {
		return moves;
	}
	
	public int getNbMoves() {
		return nbMoves;
	}
	
	public String toString(){
		return "@Opening [ " + this.id + " - " + this.opening + " - " + this.variation + " - " + this.moves + " - " + this.nbMoves + "]";
	}
	
	
}
