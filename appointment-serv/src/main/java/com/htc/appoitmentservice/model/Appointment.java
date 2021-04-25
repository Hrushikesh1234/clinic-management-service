package com.htc.appoitmentservice.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "appointments")
public class Appointment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long appoitmentId;
	
	@Column
	private Long patientId;
	
	@Column
	private String patientName;
	
	@Column
	private Long doctorId;
	
	@Column
	private String doctorName;

	@Column
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
		result = prime * result + ((appoitmentId == null) ? 0 : appoitmentId.hashCode());
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
		if (appoitmentId == null) {
			if (other.appoitmentId != null)
				return false;
		} else if (!appoitmentId.equals(other.appoitmentId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Appointment [appoitmentId=" + appoitmentId + ", patientId=" + patientId + ", patientName=" + patientName
				+ ", doctorId=" + doctorId + ", doctorName=" + doctorName + ", date=" + date + "]";
	}

	
	
}
