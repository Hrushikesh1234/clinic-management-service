package com.htc.clinicaggservice.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.htc.clinicaggservice.model.ClinicAggregate;

@RequestMapping("/default")
public interface ClinicAggService {

	@GetMapping(value="/clinic-agg-service/{appoitmentId}",produces="application/json")
	ClinicAggregate getAppointment(@PathVariable Long appointmentId);
	
}
