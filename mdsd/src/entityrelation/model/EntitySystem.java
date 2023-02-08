package entityrelation.model;

import java.util.ArrayList;
import java.util.List;

public class EntitySystem {

	private String name;
	private List<Entity> entities;
	private List<Relation> relations;
	
	public EntitySystem(String name) {
		this.name = name;
		entities = new ArrayList<Entity>();
		relations = new ArrayList<Relation>();
	}

	public void addEntity(Entity entity) {		
		entities.add(entity);
	}
	
	public void addRelation(Relation relation) {
		relations.add(relation);
	}

	public Entity getEntity(String from) {
		return entities.stream().filter(e -> e.getName().equals(from)).findFirst().get();
	}

	public List<Entity> getEntities() {
		return this.entities;
	}

	public List<Relation> getRelations() {
		return relations;
	}
	
	public String getName() {
		return this.name;
	}
}
