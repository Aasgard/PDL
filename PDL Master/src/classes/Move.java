package classes;

public class Move {

	private int id;
	private int idGame;
	private int halfMove;
	private String move;
	private FEN fen;
	
	public Move(int id, int idGame, int halfMove, String move, FEN fEN) {
		this.id = id;
		this.idGame = idGame;
		this.halfMove = halfMove;
		this.move = move;
		this.fen = fEN;
	}
	
	public int getId() {
		return id;
	}

	public int getIdGame() {
		return idGame;
	}

	public int getHalfMove() {
		return halfMove;
	}
	
	public String getMove() {
		return move;
	}

	public FEN getFEN() {
		return fen;
	}
	
	public String toString(){
		return "@Move [ " + this.id + " - " + this.idGame + " - " + this.halfMove + " - " + this.move + " - " + this.fen.toString() + " ]";
	}

}
