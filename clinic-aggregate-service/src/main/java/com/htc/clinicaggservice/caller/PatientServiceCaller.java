package com.htc.clinicaggservice.caller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.CollectionModel;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.htc.clinicaggservice.model.Patient;

@FeignClient(url = "http://localhost:8001/patient-service",name = "patient-service")
@Component
public interface PatientServiceCaller {
	
	@GetMapping("/patient/findByIdPatient")
	CollectionModel<Patient> findByIdPatient(@RequestParam("patientId") Long patientId);
	
}
