package entityrelation.dsl;

import entityrelation.model.Attribute;
import entityrelation.model.Entity;
import entityrelation.model.Relation;
import entityrelation.model.EntitySystem;

public abstract class EntityRelationInternalDSL {
	
	protected EntitySystem system;
	protected Entity currentEntity;
	
	
	protected abstract void build();
	
	public EntityRelationInternalDSL(String name) {
		system = new EntitySystem(name);
		this.build();
	}
	
	public EntityRelationInternalDSL entity(String name) {
		Entity entity = new Entity(name);
		system.addEntity(entity);
		currentEntity = entity;
		return this;
	}

	public EntityRelationInternalDSL attribute(String name, String type) {
		Attribute attribute = new Attribute(name, type);
		currentEntity.addAttribute(attribute);
		return this;
	}

	public EntityRelationInternalDSL relation(String type, String from, String to){
		Relation relation = new Relation(type, system.getEntity(from), system.getEntity(to));
		system.addRelation(relation);
		return this;
	}
	
	public EntityRelationInternalDSL inheritance(String from, String to){
		Relation relation = new Relation("Inheritance", system.getEntity(from), system.getEntity(to));
		system.addRelation(relation);
		return this;
	}
	
	public String toString() {
        StringBuffer result = new StringBuffer();
        result.append(system.getName()+'\n');
        for(Entity e: system.getEntities()) result.append(e.toString()+'\n');
        for(Relation r: system.getRelations()) result.append(r.toString()+'\n');
        return result.toString();
    }
}
