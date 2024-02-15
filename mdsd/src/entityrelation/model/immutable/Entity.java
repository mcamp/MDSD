package entityrelation.model.immutable;

import java.util.List;

import entityrelation.model.Attribute;

public class Entity {

	private String name;
	private List<Attribute> attributes;
	
	public Entity(String name) {
		this.name = name;
		attributes = List.of();
	}
	
	public Entity(String name, List<Attribute> attributes) {
		this.name = name;
		this.attributes = attributes;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String toString(){
		StringBuffer result = new StringBuffer();
		result.append(this.name);
		for(Attribute att: attributes) {
			result.append("\n\t");
			result.append(att.toString());
		}
		return result.toString();
	}
	

}
