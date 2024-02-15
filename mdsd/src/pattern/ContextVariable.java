package pattern;

import java.util.ArrayList;
import java.util.List;

import entityrelation.model.Attribute;
import entityrelation.model.Entity;

public class ContextVariable {
	
	String name;
	Entity currentEntity; // Context Variable
	List<Entity> entities = new ArrayList<Entity>();
	
	public void build() {
		system("University").
			entity("Person").
		    	attribute("name", "String").
		    	attribute("age", "Number").
	    	entity("Student").
		    	attribute("id", "Number").
	    	entity("Teacher");
	}
	
	private ContextVariable system(String name) {
		this.name = name;
		return this;
	}
	
	private ContextVariable entity(String name) {
		currentEntity = new Entity(name); // Context variable changes when 'entity' method is called
		entities.add(currentEntity);
		return this;
	}
	
	private ContextVariable attribute(String name, String type) {
		currentEntity.addAttribute(new Attribute(name,type));
		return this;
	}
}
