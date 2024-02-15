package pattern;

import java.util.HashMap;
import java.util.Map;

import entityrelation.model.Entity;
import entityrelation.model.Relation;

public class SymbolTable {
	
	public static void main(String[] args) throws Exception {
		SymbolTable example = new SymbolTable();
		example.build();
	}

	String name;
	Map<String,Entity> entities = new HashMap<String,Entity>(); // Symbol table for dynamic analysis
	
	public void build() throws Exception {
		system("University").
			entity("Person").
	    	entity("Student").
	    	entity("Teacher").
	    	inheritance("Persona", "Teacher");
		
	}
	
	private SymbolTable system(String name) {
		this.name = name;
		return this;
	}
	
	private SymbolTable entity(String name) {
		entities.put(name, new Entity(name));
		return this;
	}
	
	public SymbolTable inheritance(String from, String to) throws Exception{
		if(!entities.containsKey(from)) // dynamic catch of wrong usage of entities
			throw new Exception(String.format("Missing entity %s", from));
		Relation relation = new Relation("Inheritance", entities.get(from), entities.get(to));
		return this;
	}
	
}
