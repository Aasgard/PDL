package classes;

public class Event {

	private int id;
	private String name;
	private String city;
	
	public Event(int id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCity() {
		return city;
	}
	
	public String toString(){
		return "@Event [ " + this.id + " - " + this.name + " - " + this.city + " ]";
	}
	
}
