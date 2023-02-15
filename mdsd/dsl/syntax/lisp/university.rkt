#lang racket
(entitysystem 'University
              ((entity 'Person
                      ((attribute "name" "String")
                      (attribute "age" "Number")))
              (entity 'Student
                      ((attribute "id" "Number")))
              (entity 'Teacher ))
              ((relation "Inheritance" "Person" "Student")))