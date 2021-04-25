package com.htc.appoitmentservice.service;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.htc.appoitmentservice.model.Appointment;

@RepositoryRestResource(collectionResourceRel="appointment",path="appointment")
public interface AppointmentServiceRepository extends PagingAndSortingRepository<Appointment,Long> {

	Appointment searchByDoctorId(@Param("doctorId") Long doctorId);
	
	Appointment searchByPatientId(@Param("patientId") Long patientId);
	
}
