package entityrelation.model;

import java.util.ArrayList;
import java.util.List;

public class Entity {

	private String name;
	private List<Attribute> attributes;
	
	public Entity(String name) {
		this.name = name;
		attributes = new ArrayList<Attribute>();
	}

	public void addAttribute(Attribute attribute) {
		attributes.add(attribute);
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
