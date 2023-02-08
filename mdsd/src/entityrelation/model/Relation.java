package entityrelation.model;

public class Relation {
	
	private String type;
	private Entity from;
	private Entity to;

	public Relation(String type, Entity from, Entity to) {
		this.type = type;
		this.from = from;
		this.to = to;
	}

	public String toString(){
		return from.getName()+" "+toArrow()+" "+to.getName();
	}
	
	private String toArrow() {
		if(type.equals("Inheritance"))
			return "<|---";
		if(type.equals("1-1"))
			return "1---1";
		if(type.equals("Many-Many"))
			return "*---*";
			
		return "-----";
	}
}
