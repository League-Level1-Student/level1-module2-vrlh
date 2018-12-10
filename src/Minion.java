
public class Minion {
	private String name; 
	private int eyes; 
	private String color; 
	private String master;
	
	Minion(String name, int eyes, String color, String master){
		this.name = name;
		this.eyes = eyes;
		this.color = color;
		this.master = master;
		
	}
	String getName() {
		return name;
	}
	String getMaster() {
		return master;
	}
	int getEyes() {
		return eyes;
		
	}
	String getColor() {
		return color;
	}
	String master() {
		return master;
	}
	void setMaster(String master){
		this.master = master;
	}
	
}

