package pattern;

import java.util.ArrayList;
import java.util.List;

import entityrelation.model.Attribute;
import entityrelation.model.immutable.Entity;

public class ConstructionBuilder {
	
	String name;
	EntityBuilder entityBuilder = new EntityBuilder(); // Entity Builder
	List<Entity> entities = new ArrayList<Entity>();
	
	public void build() {
		system("University").
			entity("Person").
		    	attribute("name", "String").
		    	attribute("age", "Number").
		    end().
	    	entity("Student").
		    	attribute("id", "Number").
		    end().
	    	entity("Teacher").end();
	}
	
	private ConstructionBuilder system(String name) {
		this.name = name;
		return this;
	}
	
	private ConstructionBuilder entity(String name) {
		entityBuilder.name = name;
		return this;
	}
	
	private ConstructionBuilder attribute(String name, String type) {
		entityBuilder.attributes.add(new Attribute(name,type));
		return this;
	}
	
	private ConstructionBuilder end() {
		entities.add(entityBuilder.asEntity()); // Finish entity building process
		entityBuilder.clean();					// Clean (or create a new instance)
		return this;
	}
	
	
	private class EntityBuilder{
		public String name = "";
		public List<Attribute> attributes = new ArrayList<Attribute>();
		
		private void clean() {
			name = "";
			attributes.clear();
		}
		
		private Entity asEntity() {
			return new Entity(this.name, new ArrayList<>(this.attributes));
		}
	}
}
