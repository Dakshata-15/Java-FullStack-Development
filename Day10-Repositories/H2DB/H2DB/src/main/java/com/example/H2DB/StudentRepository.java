package com.example.H2DB;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
/*
==================================================================================================
1.Jpa Repository <Student,Long>
JpaRepository is a spring Data JPA interface that already has all the common CRUD methods built in.
*By extending it, your StudentRepository automatically gets method like:
save(Student s) -> insert/update a student
findAll() -> get all students
finById(Long id) ->get one student
deleteById(Long id) -> delete a student
You don't need to write SQL or implement these methods yourself - Spring generates them at runtime.

2.<Student,Long>
The first type parameter(Student) tells JPA which entity this repository manages.
-> Its tied to your Student table.
The second type parameter (Long) tells JPA the type of the primary key(id).
-> Since your Student entity has private Long id;, you specify Long

3.public interface StudentRepository
It's an interface, not a class
You don't write any code inside-SpringBoot automatically creates a working implementation at runtime.
===================================================================================================
 */