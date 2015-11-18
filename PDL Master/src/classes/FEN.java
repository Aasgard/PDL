package classes;

public class FEN {

	private String id;
	private String log;
	
	public FEN(String id, String log) {
		this.id = id;
		this.log = log;
	}

	public String getId() {
		return id;
	}

	public String getLog() {
		return log;
	}
	
	public String toString(){
		return "@FEN [ " + this.id + " - " + this.log + " ]";
	}

}
