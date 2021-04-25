package com.htc.clinicaggservice.model;

import java.time.LocalDate;
import java.util.List;

public class ClinicAggregate {

	private Long appointmentId;
	
	private Long patientId;
	
	private String patientName;

	private Long doctorId;
	
	private String doctorName;
	
	private LocalDate date;
	
	private List<Patient> patient;

	public ClinicAggregate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClinicAggregate(Long appointmentId, Long patientId, String patientName, Long doctorId, String doctorName,
			LocalDate date, List<Patient> patient) {
		super();
		this.appointmentId = appointmentId;
		this.patientId = patientId;
		this.patientName = patientName;
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.date = date;
		this.patient = patient;
	}

	public Long getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(Long appointmentId) {
		this.appointmentId = appointmentId;
	}

	public Long getPatientId() {
		return patientId;
	}

	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public Long getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Long doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public List<Patient> getPatient() {
		return patient;
	}

	public void setPatient(List<Patient> patient) {
		this.patient = patient;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((appointmentId == null) ? 0 : appointmentId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClinicAggregate other = (ClinicAggregate) obj;
		if (appointmentId == null) {
			if (other.appointmentId != null)
				return false;
		} else if (!appointmentId.equals(other.appointmentId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ClinicAggregate [appointmentId=" + appointmentId + ", patientId=" + patientId + ", patientName="
				+ patientName + ", doctorId=" + doctorId + ", doctorName=" + doctorName + ", date=" + date
				+ ", patient=" + patient + "]";
	}
	
}
