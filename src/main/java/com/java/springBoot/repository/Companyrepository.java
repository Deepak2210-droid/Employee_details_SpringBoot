package com.java.springBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.java.springBoot.model.CompanyDetails;

@Repository
public interface Companyrepository extends JpaRepository<CompanyDetails, Long> {
	
	@Query("select c from CompanyDetails c where c.id=:id")
	CompanyDetails getCompanyDetails(@Param("id") Long id);

}
