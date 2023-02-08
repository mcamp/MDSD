package entityrelation.model;

public class Attribute {
	private String name;
	private String type;
	
	public Attribute(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public String toString(){
		return name+" : "+type;
	}
}
