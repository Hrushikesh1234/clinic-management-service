package com.htc.clinicaggservice.model;

import java.time.LocalDate;

public class Appointment {

	private Long appoitmentId;
	
	private Long patientId;
	
	private String patientName;
	
	private Long doctorId;
	
	private String doctorName;

	private LocalDate date;

	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Appointment(Long appoitmentId, Long patientId, String patientName, Long doctorId, String doctorName,
			LocalDate date) {
		super();
		this.appoitmentId = appoitmentId;
		this.patientId = patientId;
		this.patientName = patientName;
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.date = date;
	}

	public Long getAppoitmentId() {
		return appoitmentId;
	}

	public void setAppoitmentId(Long appoitmentId) {
		this.appoitmentId = appoitmentId;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((patientId == null) ? 0 : patientId.hashCode());
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
		Appointment other = (Appointment) obj;
		if (patientId == null) {
			if (other.patientId != null)
				return false;
		} else if (!patientId.equals(other.patientId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Appiontment [appoitmentId=" + appoitmentId + ", patientId=" + patientId + ", patientName=" + patientName
				+ ", doctorId=" + doctorId + ", doctorName=" + doctorName + ", date=" + date + "]";
	}
	
}
