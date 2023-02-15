/*
 * Modified example from Ulrik Pagh Schultz Lundquist example
 * https://github.com/ulrikpaghschultz/MDSD/blob/master/src/examples/misc/EntitiesMethodChainWithConstraints.java
 * 
 * */

package syntax;

public class EntityMethodChainConstraint {
	
	public void build() {
		system("University").
			entity("Person").
		    	attribute("name", "String").
		    	attribute("age", "Number").
	    	entity("Student").
		    	attribute("id", "Number").
	    	entity("Teacher").
	    	relation("Inheritance", "Person", "Student").
	    	relation("Inheritance", "Person", "Teacher");
	}
	
	// Builder definitions, placed in this class to show declarations, place elsewhere in real system
	private interface Builder {
		EntityBuilder entity(String name);
		Builder relation(String type, String from, String to);
	}
	
	private interface EntityBuilder extends Builder {
		EntityBuilder attribute(String name, String type);
	}

	static Builder system(String name) { return null; }
}
