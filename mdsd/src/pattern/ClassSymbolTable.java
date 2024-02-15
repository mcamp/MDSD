package pattern;


import entityrelation.model.Entity;
import entityrelation.model.Relation;

public class ClassSymbolTable {
	
	public static void main(String[] args) throws Exception {
		ClassSymbolTable example = new ClassSymbolTable();
		example.build();
	}

	String name;
	Entity Student, Person, Teacher; // Class Symbols
	
	public void build() throws Exception {
		system("University").
			entity(Person).
	    	entity(Student).
	    	entity(Teacher).
	    	inheritance(Person, Teacher);
		
	}
	
	private ClassSymbolTable system(String name) {
		this.name = name;
		return this;
	}
	
	private ClassSymbolTable entity(Entity entity) {
		return this;
	}
	
	public ClassSymbolTable inheritance(Entity from, Entity to) throws Exception{
		Relation relation = new Relation("Inheritance", from, to);
		return this;
	}
	
}
