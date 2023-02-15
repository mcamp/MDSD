/*
 * Modified example from Ulrik Pagh Schultz Lundquist example
 * https://github.com/ulrikpaghschultz/MDSD/blob/master/src/examples/misc/EntitiesSequence.java
 * 
 * */

package syntax;


public class EntityFunctionSequence {

	public void build() {
		system("University");
			entity("Person");
		    	attribute("name", "String");
		    	attribute("age", "Number");
	    	entity("Student");
		    	attribute("id", "Number");
	    	entity("Teacher");
	    	relation("Inheritance", "Person", "Student");
	    	relation("Inheritance", "Person", "Teacher");
	}
	
	// Builder definitions, placed in this class to show declarations, place elsewhere in real system
	protected static void entity(String name){ throw new Error("not implemented");}
	protected static void relation(String type, String from, String to){ throw new Error("not implemented");}
	protected static void attribute(String type, String name){ throw new Error("not implemented");}
	protected static void system(String name){ throw new Error("not implemented");}
}
