package com.htc.clinicaggservice.caller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.htc.clinicaggservice.model.Appointment;

@FeignClient(url = "http://localhost:8001/appointment-service",name = "appointment-service")
@Component
public interface AppointmentServiceCaller {
	
	@GetMapping("/appointment/search/searchByPatientId")
	Appointment findByPatientId(@RequestParam("patientId") Long patientId);
}
