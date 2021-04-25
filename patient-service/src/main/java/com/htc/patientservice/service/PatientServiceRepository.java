package com.htc.patientservice.service;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.htc.patientservice.model.Patient;

@RepositoryRestResource(collectionResourceRel="patient",path="patient")
public interface PatientServiceRepository extends PagingAndSortingRepository<Patient,Long> {

	Patient searchByMobileNo(@Param("mobileNo") Long mobileNo);
	
	Patient searchByFirstNameAndLastName(@Param("firstName") String firstName, @Param("lastName") String lastName);
}
