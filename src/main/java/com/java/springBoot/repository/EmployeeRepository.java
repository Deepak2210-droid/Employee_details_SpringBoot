package com.java.springBoot.repository;



import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.java.springBoot.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
	@Query("select e from Employee e where e.id=:id and e.deleted=0")
	Employee getempl(@Param("id") Long id);
	
	@Transactional
	@Modifying
	@Query("update Employee e set e.deleted=1 where e.id=:id")
	int deleteEmployee(@Param("id") Long id);


	}
