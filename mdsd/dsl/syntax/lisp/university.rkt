#lang racket

(define (entitysystem system entities relations) (list system entities relations))
(define (entity name attributes) (list name attributes))
(define (attribute name type) (list name type))
(define (relation type from to) (list type from to))

(entitysystem 'University
              '((entity 'Person
                        '((attribute "name" "String")
                         (attribute "age" "Number")))
                (entity 'Student
                        ((attribute "id" "Number")))
                (entity 'Inheritance))
              '((relation "Inheritance" "Person" "Student")))
