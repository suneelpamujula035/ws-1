package com.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	
	
//	@Query("select s from Student s where s.name:name")//named query
	@Query("select s from Student s where s.name=?1")//indexed query
	Student findingStudentByName(@Param("name") String name1);
	
	@Query("select AVG(salary) from Student s")
	double avgSal();
}
