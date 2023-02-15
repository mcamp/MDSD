/*
 * Modified example from Ulrik Pagh Schultz Lundquist example
 * https://github.com/ulrikpaghschultz/MDSD/blob/master/src/examples/misc/EntitiesMethodChain.java
 * 
 * */

package syntax;

public class EntityMethodChain {
	
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
		Builder entity(String name);
		Builder relation(String type, String from, String to);
		Builder attribute(String type, String name);
	}
	static Builder system(String name) { return null; }
}
