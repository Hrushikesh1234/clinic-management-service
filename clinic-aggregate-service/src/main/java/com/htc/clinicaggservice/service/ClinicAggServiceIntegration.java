package com.htc.clinicaggservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.htc.clinicaggservice.caller.AppointmentServiceCaller;
import com.htc.clinicaggservice.caller.PatientServiceCaller;
import com.htc.clinicaggservice.model.Appointment;
import com.htc.clinicaggservice.model.ClinicAggregate;
import com.htc.clinicaggservice.model.Patient;

@RestController
public class ClinicAggServiceIntegration implements ClinicAggService {
	
	@Autowired
	private AppointmentServiceCaller asc;
	
	@Autowired
	private PatientServiceCaller psc;
	
	@Override
	public ClinicAggregate getAppointment(Long appointmentId) {
		ClinicAggregate ac = new ClinicAggregate();
		Appointment a = new Appointment();
		
		a = asc.findByPatientId(appointmentId);
		
		ac.setAppointmentId(a.getAppoitmentId());
		ac.setPatientId(a.getPatientId());
		ac.setPatientName(a.getPatientName());
		ac.setDoctorId(a.getDoctorId());
		ac.setDoctorName(a.getDoctorName());
		ac.setDate(a.getDate());
		
		List<Patient> patient = new ArrayList<>();
		patient.addAll(psc.findByIdPatient(appointmentId).getContent());
		
		ac.setPatient(patient);
		
		return ac;
	}

}
