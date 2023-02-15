package entityrelation.examples;

import entityrelation.dsl.EntityRelationInternalDSL;
import entityrelation.model.Attribute;
import entityrelation.model.Entity;
import entityrelation.model.Relation;
import entityrelation.model.EntitySystem;

public class University extends EntityRelationInternalDSL{

	public University() {
		super("University");
	}

//	@Override
//	protected void build() {
//		Entity person = new Entity("Person");
//		person.addAttribute(new Attribute("name", "String"));
//		person.addAttribute(new Attribute("age", "Number"));
//		Entity student = new Entity("Student");
//		student.addAttribute(new Attribute("id", "Number"));
//		Entity teacher = new Entity("Teacher");
//		Entity course = new Entity("Course");
//		course.addAttribute(new Attribute("title", "String"));
//		Relation r1 = new Relation("Inheritance", person, student);
//		Relation r2 = new Relation("Inheritance", person, teacher);
//		Relation r3 = new Relation("1-1", course, teacher);
//		Relation r4 = new Relation("Many-Many", course, student);
//		
//		system = new EntitySystem("University");
//		system.addEntity(person);
//		system.addEntity(teacher);
//		system.addEntity(student);
//		system.addEntity(course);
//		system.addRelation(r1);
//		system.addRelation(r2);
//		system.addRelation(r3);
//		system.addRelation(r4);
//	}
	
	@Override
	protected void build() {
		  entity("Person").
		    attribute("name", "String").
		    attribute("age", "Number").
		  entity("Student").
		    attribute("id", "Number").
		  entity("Teacher").
		  entity("Course").
		    attribute("title", "String").
		  inheritance("Persona", "Student").
		  relation("Inheritance", "Person", "Teacher").
		  relation("1-1", "Course", "Teacher").
		  relation("Many-Many", "Course", "Student") ;
	}
	
	
	public static void main(String[] args) {
		University university = new University();
		System.out.println(university);
	}
	

}
