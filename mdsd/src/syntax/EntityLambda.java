/*
 * Modified example from Ulrik Pagh Schultz Lundquist example
 * https://github.com/ulrikpaghschultz/MDSD/blob/master/src/examples/misc/EntitiesLambda.java
 * 
 * */

package syntax;

import java.util.function.Consumer;

public class EntityLambda {
	
	public void build() {
		builder.system("University", s -> {
			s.entity("Person", e -> {
		    	e.attribute("name", "String");
		    	e.attribute("age", "Number");
			});
	    	s.entity("Student", e -> {
		    	e.attribute("id", "Number");
	    	});
	    	s.entity("Student");
		});
	}
	
	// Builder definitions, placed in this class to show declarations, place elsewhere in real system
	
	private IBuilder builder;
	private interface IBuilder {
		void system(String name, Consumer<IEntityBuilder> f);
	}
	private interface IEntityBuilder {
		void entity(String name, Consumer<IEntityMemberBuilder> f);
		void entity(String name);
	}
	private interface IEntityMemberBuilder {
		void attribute(String name, String type);	
	}
}
