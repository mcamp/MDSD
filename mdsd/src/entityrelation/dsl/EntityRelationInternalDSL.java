package entityrelation.dsl;

import entityrelation.model.Attribute;
import entityrelation.model.Entity;
import entityrelation.model.Relation;
import entityrelation.model.EntitySystem;

public abstract class EntityRelationInternalDSL {
	
	protected EntitySystem system;
	
	
	protected abstract void build();
	
	public EntityRelationInternalDSL(String name) {
		system = new EntitySystem(name);
		this.build();
	}
	
	public EntityRelationInternalDSL entity(String name) {
		//todo
		return this;
	}

	public EntityRelationInternalDSL attribute(String name, String type) {
		//todo
		return this;
	}

	public EntityRelationInternalDSL relation(String type, String from, String to){
		//todo
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
